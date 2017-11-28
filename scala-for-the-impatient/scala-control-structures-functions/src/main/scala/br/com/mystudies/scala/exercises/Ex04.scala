package br.com.mystudies.scala.exercises

/**
 * Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 */
object Ex04 extends App {

  // with a range and reverse
  (0 to 10).reverse.foreach(println)

  // with a for loop
  for ( i <- 10.to(0, -1)) println(i)

}