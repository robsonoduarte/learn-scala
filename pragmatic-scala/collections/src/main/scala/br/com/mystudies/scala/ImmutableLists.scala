package br.com.mystudies.scala

object ImmutableLists extends App {


  val feeds = List("blog.toolshed.com","pragdave.me.com","blog.agiledeveloper.com")

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


  // filter , forall , exists
  println(s"Feeds with blog : ${feeds.filter( _ contains "blog").mkString(", ")}")
  println(s"All feeds have com: ${feeds.forall( _ contains "com")}")
  println(s"All feeds have dave: ${feeds.forall( _ contains "dave")}")
  println(s"Any feeds have dave: ${feeds.exists( _ contains "dave")}")
  println(s"Any feeds have bill: ${feeds.exists( _ contains "bill")}")


  // map
  println(s"Feed url lengths : ${feeds.map(_ length).mkString(", ")}")


  // foldleft
  val total = feeds.foldLeft(0)((total, feed) => total + feed.length)
  println(s"Total length of feed urls: $total")


  // alternative to the foldLeft
  val total2 = (0 /: feeds) {(total, feed) => total + feed.length}
  println(s"Total length of feed urls: $total2")

  // using the concise code
  val total3 = (0 /: feeds) {_ + _.length}
  println(s"Total length of feed urls: $total3")



}

