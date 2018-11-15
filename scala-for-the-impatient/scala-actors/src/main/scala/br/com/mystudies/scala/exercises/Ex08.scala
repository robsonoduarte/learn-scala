package br.com.mystudies.scala.exercises


/**
 * Rewrite the example at the end of Section 3.4 , “ Transforming Arrays ,” on page 32 .
 * Collect indexes of the negative elements, reverse the sequence, drop the last index,
 * and call a.remove(i) for each index.
 * Compare the efficiency of this approach with the two approaches in Section 3.4 .
 */
object Ex08 extends App {

  val a = Array(51,-42,30,-4,25,-51,8,42)
  val res = for (i <- 0 until a.length if (i<=a.indexWhere(_<0)||a(i)>0)) yield a(i)
}
