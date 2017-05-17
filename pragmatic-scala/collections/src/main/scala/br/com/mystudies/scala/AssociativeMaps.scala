package br.com.mystudies.scala

object AssociativeMaps extends App{

  val feeds = Map(
        "Andy Hunt" -> "blog.tooshed.com",
        "Dave Thomas" -> "pragdave.me",
        "NFJS" -> "nofluffjuststuff.com/blog"
      )


       // filter by key
      val filterNamesStartWithD = feeds filterKeys { _ startsWith "D" }
      println(s"# of Filtered: ${filterNamesStartWithD.size}")


     // filter on the values

     val filterNameStartWithDAndPragInFeed = feeds filter {elem =>
        val (key, value) = elem
       (key startsWith "D") && (value contains "prag")
      }

      println(s"# of feeds with auth name D* and pragprog in URL: ${filterNameStartWithDAndPragInFeed.size}")


}