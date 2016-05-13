package br.com.mystudies.from.scala



object Parameters extends App {

    def max (values: Int*) = values.foldLeft(values(0))(Math.max) // -> ((a,b) => Math.max(a,b))

    println(max(11,3,10))
    println(max(0,3,10, 20, -1, 4))


    def function(input: Int*) = println(input.getClass)

    function(1,2,3,4,5)
}