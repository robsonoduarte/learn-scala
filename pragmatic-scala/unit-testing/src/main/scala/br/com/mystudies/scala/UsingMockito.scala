package br.com.mystudies.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.mockito.Mockito._
import org.mockito.Matchers._
import org.scalatest.mockito.MockitoSugar


class UsingMockito extends FlatSpec with Matchers with MockitoSugar{

  def withWordScorer(test: WordScore => Unit) =  {
    val speelChecker = mock[SpellChecker]
    when(speelChecker.isCorrect(anyString)).thenReturn(true)

    test(new WordScore(speelChecker))

    verify(speelChecker, times(1)).isCorrect(anyString)
  }


  "score" should "return 0 for an empty word" in {
    withWordScorer { wordScore => wordScore.score("") should be (0) }
  }

  "score" should "return 2 for word with two vowels" in {
    withWordScorer { _.score("ai") should be (2) }
  }

  "score" should "return 8 for word with four consonants" in {
    withWordScorer { _.score("myth") should be (8) }
  }


  "score" should "return 7 for word with an vowel and three consonants" in {
    withWordScorer { _.score("that") should be (7) }
  }
}


class WordScore(spellChecker: SpellChecker){
  private val VOWELS = List('a', 'e', 'i', 'o', 'u')
  def score(word: String) ={
		 spellChecker.isCorrect(word)
    (0 /: word){ (total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2)}

    // or ->  word.foldLeft(0)((total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2) )
    // or ->  word.foldLeft(0)((total: Int,letter:Char) => total + (if(VOWELS.contains(letter)) 1 else 2) )
  }
 }


trait SpellChecker{
  def isCorrect(word: String) : Boolean
}