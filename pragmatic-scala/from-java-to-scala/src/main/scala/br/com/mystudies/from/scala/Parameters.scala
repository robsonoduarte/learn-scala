package br.com.mystudies.from.scala



object Parameters extends App {

    def max (values: Int*) = values.foldLeft(values(0))(Math.max) // -> ((a,b) => Math.max(a,b))

    print(max(11,3,10))
}