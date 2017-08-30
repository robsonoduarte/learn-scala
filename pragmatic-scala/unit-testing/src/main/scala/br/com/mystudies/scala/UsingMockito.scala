package br.com.mystudies.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.mockito.Mockito._
import org.mockito.Matchers._
import org.scalatest.mockito.MockitoSugar


class UsingMockito extends FlatSpec with Matchers with MockitoSugar{

  def withWordScorer(test: WordScore => Unit) =  {
    val spellChecker = mock[SpellChecker]
    when(spellChecker.isCorrect(anyString)).thenReturn(true)

    test(new WordScore(spellChecker))

    verify(spellChecker, times(1)).isCorrect(anyString)
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

  "score" should "return 0 from word with icorret spelling " in {
    val spellChecker = mock[SpellChecker]
    when(spellChecker.isCorrect("aoe")).thenReturn(false)
    val wordScore = new WordScore(spellChecker)

    wordScore.score("aoe") should be (0)

    verify(spellChecker, times(1)).isCorrect("aoe")

  }
}


class WordScore(spellChecker: SpellChecker){
  private val VOWELS = List('a', 'e', 'i', 'o', 'u')
  def score(word: String) ={
		if(spellChecker.isCorrect(word))
    (0 /: word){ (total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2)}

    // or ->  word.foldLeft(0)((total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2) )
    // or ->  word.foldLeft(0)((total: Int,letter:Char) => total + (if(VOWELS.contains(letter)) 1 else 2) )

		else
		  0
  }
 }


trait SpellChecker{
  def isCorrect(word: String) : Boolean
}
