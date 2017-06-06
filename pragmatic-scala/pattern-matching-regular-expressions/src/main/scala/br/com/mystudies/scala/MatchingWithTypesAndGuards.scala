package br.com.mystudies.scala

object MatchingWithTypesAndGuards extends App {

  def process(input: Any){
    input match{
      case (a: Int, b:Int) => println("Processing (int,int)...")
      case (a: Double, b:Double ) => println("Processing (double,double)...")
      case msg : Int if(msg > 1000000) => println("Processing int > 1000000")
      case msg: Int => println("Processing int...")
      case msg: String => println("Processing string...")
      case _ => println(s"Can't handle $input")
    }
  }


  process((34.2, -159.3))
  process(0)
  process(1000001)
  process(2.2)

}