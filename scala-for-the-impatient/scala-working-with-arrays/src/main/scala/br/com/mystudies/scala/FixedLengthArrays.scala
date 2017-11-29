package br.com.mystudies.scala

object FixedLengthArrays extends App {


  // AN ARRAY OF TEN INTEGERS, ALL INITIALIZED WITH ZERO
  val nums = new Array[Int](10)

  nums(0) = 1
  // nums(11) = 1 java.lang.ArrayIndexOutOfBoundsException: 11

  println(nums mkString " ")




  // AN ARRAY WITH TEN ELEMENTS, ALL INITIALIZED WITH NULL
  val s = new Array[String](10)

  s(0) = "Robson"

  println(s mkString " ")





}