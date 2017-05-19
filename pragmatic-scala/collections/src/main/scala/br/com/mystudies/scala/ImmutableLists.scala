package br.com.mystudies.scala

object ImmutableLists extends App {


  val fedds = List("blog.toolshed.com","pragdave.me","blog.agiledeveloper.com")



  // head and get
  println(s"First feed: ${fedds.head}" )
  println(s"First feed: ${fedds(1)}" )

}