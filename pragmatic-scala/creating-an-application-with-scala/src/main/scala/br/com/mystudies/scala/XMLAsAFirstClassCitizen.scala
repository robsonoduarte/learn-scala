package br.com.mystudies.scala

object XMLAsAFirstClassCitizen extends App {


  val xmlFragment =
  <symbols>
	<symbol ticker="AAPL"><units>200</units></symbol>
	<symbol ticker="IBM"><units>215</units></symbol>
  </symbols>


  println(xmlFragment)
  println(xmlFragment.getClass)

  println("--------------------------------------------------------")

  // using the Xpath-like query
  val symbolsNodes =  xmlFragment \ "symbol"
  symbolsNodes foreach println
  println(symbolsNodes.getClass)


  println("--------------------------------------------------------")

  // search through all elements in the hierarchy
  val unitNodes = xmlFragment \\ "units"
  unitNodes foreach println
  println(unitNodes.getClass)
  println(unitNodes.head.text)


  println("--------------------------------------------------------")

  // using the pattern match
  unitNodes.head match {
    case <units>{numberOfUnits}</units> => println(s"Units: $numberOfUnits")
  }

  println("--------------------------------------------------------")

  // grab all elements
  xmlFragment  match {
    case <symbols>{symbolNodes @ _*}</symbols> =>
      for(symbolNode @ <symbol>{_*}</symbol> <- symbolsNodes)
        println("%-7s %s".format(symbolNode \ "@ticker", (symbolNode \ "units").text))
  }

























}
