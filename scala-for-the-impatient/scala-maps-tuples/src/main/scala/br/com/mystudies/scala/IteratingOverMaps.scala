package br.com.mystudies.scala

object IteratingOverMaps extends App {


  val scores = Map("Bob" -> 10, "Cindy" -> 7, "Fred" -> 4)


  // access key/value
  for((k,v) <- scores)
    print((k,v))



  // only values
  for( v <- scores.values)
   println(v)


   //reverse one map
   val reverseMap = for((k,v) <- scores) yield (v,k)
   print(reverseMap)




   // apply one function
   val highScores = scores.filter{case (k,v) => v > 5}
   print(highScores)


}