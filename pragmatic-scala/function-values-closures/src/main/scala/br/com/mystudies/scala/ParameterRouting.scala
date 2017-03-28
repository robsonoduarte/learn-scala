package br.com.mystudies.scala

import java.lang.Integer.MIN_VALUE


object ParameterRouting extends App {

  var arr = Array(1,2,5,10,1,6)

  val largest1 = ( MIN_VALUE /: arr )(Math.max(_,_))
  print(largest1)

  val largest2 = ( MIN_VALUE /: arr )(Math.max _)
  print(largest2)



}