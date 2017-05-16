package br.com.mystudies.scala

object AssociativeMaps extends App{

  val feeds = Map(
        "Andy Hunt" -> "blog.tooshed.com",
        "Dave Thomas" -> "pragdave.me",
        "NFJS" -> "nofluffjuststuff.com/blog"
      )




       // filter

      val filterNamesStartWithD = feeds filterKeys { _ startsWith "D" }
      println(s"# of Filtered: ${filterNamesStartWithD.size}")


}