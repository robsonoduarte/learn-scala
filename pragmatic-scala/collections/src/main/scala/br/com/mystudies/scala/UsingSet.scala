package br.com.mystudies.scala

object UsingSet extends App {

  val feeds1 = Set("blog.toolshed.com", "pragdeve.me", "blog.agiledeveloper.com")
  val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")



  // filter

  val blogFeeds = feeds1 filter { _ contains "blog" }
  println(s"blog feeds: ${blogFeeds.mkString(", ")}")

}