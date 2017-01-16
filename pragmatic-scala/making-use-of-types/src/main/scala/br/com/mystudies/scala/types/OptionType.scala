package br.com.mystudies.scala.types

object OptionType extends App{


  // Some and None is extends the Optinal
  //http://www.scala-lang.org/api/current/scala/None$.html
  //http://www.scala-lang.org/api/current/scala/Some.html

  def commentOnPractice(input: String) = if( input == "test") Some("good") else None


  Set("test", "hack") foreach( s => {
    val commentDisplay = commentOnPractice(s).getOrElse("Found no comments")
    println(s"input: $s comment: $commentDisplay")
  })




}