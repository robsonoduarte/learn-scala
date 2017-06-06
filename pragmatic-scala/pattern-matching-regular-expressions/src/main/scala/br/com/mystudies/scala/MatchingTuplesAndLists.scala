package br.com.mystudies.scala

object MatchingTuplesAndLists extends App {

  def processCoordinates(input: Any){
    input match{
      case (lat,long) => printf("Processing (%d, %d)...", lat, long)
      case "done" => println("done")
      case _ => println("invalid input")
    }
  }

  processCoordinates((39,-104))
  processCoordinates("done")



  def processItems(items: List[String]){
    items match{
      case List("apple", "ibm") => println("Apples and IBMs")
      case List("red", "blue", "white") => println("Stars and Stripes...")
      case List("red", "blue", _*) => println("colors red, blue,...")
      case List("apple", "orange", otherFruits @ _*) => println(s"apples, oranges and $otherFruits")
    }
  }


  processItems(List("apple", "ibm"))
  processItems(List("red", "blue", "green"))
  processItems(List("red", "blue", "white"))
  processItems(List("apple", "orange", "grapes", "dates"))


}