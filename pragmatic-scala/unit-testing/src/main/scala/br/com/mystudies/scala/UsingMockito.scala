package br.com.mystudies.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class UsingMockito extends FlatSpec with Matchers {


  def withWordScorer(test: WordScore => Unit){
    val wordScore = new WordScore
    test(wordScore)
  }


}


class WordScore(){
 // private val VOWELS =
}