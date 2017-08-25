package br.com.mystudies.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class UsingMockito extends FlatSpec with Matchers {


  def withWordScorer(test: WordScore => Unit) = test(new WordScore)



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


class WordScore(){
  private val VOWELS = List('a', 'e', 'i', 'o', 'u')
  def score(word: String) ={
    (0 /: word){ (total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2)}

    // or ->  word.foldLeft(0)((total,letter) => total + (if(VOWELS.contains(letter)) 1 else 2) )
    // or ->  word.foldLeft(0)((total: Int,letter:Char) => total + (if(VOWELS.contains(letter)) 1 else 2) )
  }
 }