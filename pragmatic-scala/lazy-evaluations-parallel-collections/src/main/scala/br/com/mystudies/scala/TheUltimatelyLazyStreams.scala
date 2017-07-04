package br.com.mystudies.scala

object TheUltimatelyLazyStreams extends App{

  def generate(starting: Int) : Stream[Int] = {
    starting #:: generate(starting + 1)
  }


  println(generate(25))
  println(generate(25).take(10).force)
  println(generate(25).take(10).toList)
  println(generate(25).takeWhile(_ < 40).toList)


  def isDivisibleBy(number: Int, divisor: Int) = number % divisor == 0

  def isPrime(number: Int) = number > 1 && !(2 to number - 1).exists(isDivisibleBy(number, _))

  def primes(starting: Int) : Stream[Int] = {
    println(s"computing for $starting")
    if(isPrime(starting))
       starting #:: primes(starting + 1)
    else
      primes(starting + 1)
  }


  val primesFrom100 = primes(100)

  println(primesFrom100.take(3).toList)
  println("Let's ask for more")
  println(primesFrom100.take(4).toList)


}