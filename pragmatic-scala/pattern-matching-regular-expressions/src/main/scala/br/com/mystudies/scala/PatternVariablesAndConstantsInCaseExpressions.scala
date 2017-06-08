package br.com.mystudies.scala

object PatternVariablesAndConstantsInCaseExpressions extends App {

  val sample = new Sample

  try {
    sample.process(0)
  } catch {
    case ex: Throwable => println(ex)
  }

  sample.process(100)


  val sample2 = new Sample2

  try {
	  sample2.process(0)
  } catch {
  case ex: Throwable => println(ex)
  }

  sample2.process(100)

}



class Sample{
  val max = 100

  def process(input: Int){
    input match{
     // case max => println(s"You matched max $max") // in this case the Scala was inferred as a pattern variable and not as a constant value defined in the field
     //case this.max => println(s"You matched max $max") // here we can refer to the hidden fields with explicit scoping
      case `max`=> println(s"You matched max $max") // given a hint do Scala resolves the variable in the current scope.
    }
  }
}



class Sample2{
  val MAX = 100

  def process(input: Int){
    input match{
      case MAX=> println(s"You matched max $MAX") // use uppercase names form true constants that Scala will match automatically
    }
  }
}