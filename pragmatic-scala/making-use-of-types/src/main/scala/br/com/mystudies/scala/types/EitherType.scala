package br.com.mystudies.scala.types

object EitherType extends App{


  //http://www.scala-lang.org/api/current/scala/util/Either.html

  def compute(input: Int) = if(input > 0) Right(math.sqrt(input)) else Left("Error computing, invalid input")


  def displayResult(result: Either[String,Double]) = {
    println(s"Raw: $result")
    result match{
      case Right(value) => println(s"Result -> $value")
      case Left(err) => println(s"Erro -> $err")
    }
  }

  displayResult(compute(4))
  displayResult(compute(-1))

}