package br.com.mystudies.from.scala



object Parameters extends App {

    def max (values: Int*) = println(values.foldLeft(values(0))(Math.max)) // -> ((a,b) => Math.max(a,b))

    max(11,3,10)
    max(0,3,10, 20, -1, 4)


    def function(input: Int*) = println(input.getClass)

    function(1,2,3,4,5)



    val numbers = Array(1,2,3,4,5)
    //max(numbers) -> the error of type incompatibility the parameter is Int not Array

    // but we can passa the array using the explode notation
    max(numbers: _*)


}