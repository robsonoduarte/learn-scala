package br.com.mystudies.scala

object VariableArguments extends App {


  // take a variable number of arguments
  def sum(args: Int*) = {
    var result = 0
    for(arg <- args ) result += arg
    result
  }



}