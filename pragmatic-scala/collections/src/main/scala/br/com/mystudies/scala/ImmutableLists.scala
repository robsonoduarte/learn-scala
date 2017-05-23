package br.com.mystudies.scala

object ImmutableLists extends App {


  val feeds = List("blog.toolshed.com","pragdave.me","blog.agiledeveloper.com")

  // head and get
  println(s"First feed: ${feeds.head}" )
  println(s"First feed: ${feeds(1)}" )

  // prefix
  val prefixedList = "forums.pragprog.com/forum/87" :: feeds
  println(s"First Feed In Prefixed: ${prefixedList.head}")
  println(s"The FeedPrefixed: ${prefixedList}")


  //append
  val feedsWithForums =
    feeds ::: List("forums.pragprog.com/forums/87", "forums.pragprog.com/forum/287")

  println(s"First feed in feeds with forum: ${feedsWithForums.head}")
  println(s"Last feed in feeds with forum: ${feedsWithForums.last}")


  // append an element
  val appendedList = feeds ::: List("agilelearner.com")
  println(s"Last Feed in Appended: ${appendedList.last}" )


}

