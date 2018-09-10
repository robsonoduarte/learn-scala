package br.com.mystudies.scala.exercises
/**
 * Reimplement the Time class from the preceding exercise so that the internal representation is the number of minutes
 * since midnight (between 0 and 24 × 60 – 1).
 *
 * Do not change the public interface. That is, client code should be unaffected by your change.
 */
object Ex04 extends App {


  class Time(hours:Int, minutes: Int){
    private val _minutes = hours * 60 + minutes
    def before(other:Time) = _minutes < other._minutes
  }


  val t1 = new Time(10,20)
  val t2 = new Time(20,20)

  assert(t1 before t2)

}