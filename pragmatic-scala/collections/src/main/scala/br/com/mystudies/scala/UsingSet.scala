package br.com.mystudies.scala

object UsingSet extends App {

  val feeds1 = Set("blog.toolshed.com", "pragdeve.me", "blog.agiledeveloper.com")
  val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")


  // filter

  val blogFeeds = feeds1 filter { _ contains "blog" }
  println(s"blog feeds: ${blogFeeds mkString ", "}")


  // merge
  val mergedFeeds = feeds1 ++ feeds2
  println(s"# of merged feeds: ${mergedFeeds size}")


  // intersect
  val commonsFeeds = feeds1 & feeds2
  println(s"commons feeds: ${commonsFeeds mkString ", "}")

  // map
  val urls = feeds1 map { "http://" + _ }
  println(s"One url: ${urls.head}")


  // foreach
  feeds1 foreach {fedd => println(s"Refreshing $fedd")}
}
