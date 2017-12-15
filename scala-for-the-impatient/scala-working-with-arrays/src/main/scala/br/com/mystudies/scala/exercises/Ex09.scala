package br.com.mystudies.scala.exercises

import java.util.TimeZone

/**
 * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
 * Strip off the "America/" prefix and sort the result.
 */
object Ex09 extends App {

  val prefix = "America/"

  val x = TimeZone.getAvailableIDs.filter(_.startsWith(prefix)).map(_.stripPrefix(prefix)).sorted

  x.foreach(println)

}