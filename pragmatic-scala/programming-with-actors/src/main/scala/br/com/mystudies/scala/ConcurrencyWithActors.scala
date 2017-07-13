package br.com.mystudies.scala


import akka.actor._
import akka.routing._
import java.io._

object ConcurrencyWithActors extends App {

  val system = ActorSystem("sample")

  val filesCounter = system.actorOf(Props[FilesCounter])

  filesCounter ! "C:/Users/Robson/"

}



class FileExplorer extends Actor{

  def receive = {
    case dirName : String =>
      println(s"Reading files in $dirName")
      val file = new File(dirName)
      val children = file listFiles()
      var filesCount = 0

      if(children != null){
        children.filter(_.isDirectory())
                .foreach(sender ! _.getAbsolutePath)
        filesCount = children.count(!_.isDirectory())
      }

      sender ! filesCount
  }

}


class FilesCounter extends Actor{
  val start = System.nanoTime
  var filesCount = 0L
  var pending = 0

  var fileExplores =
    context.actorOf(RoundRobinPool(100).props(Props[FileExplorer]))

    def receive = {

      case dirName : String =>
        pending = pending + 1
        fileExplores ! dirName

      case count: Int =>
        filesCount = filesCount + count
        pending = pending -1


      if(pending == 0){
        val end = System.nanoTime()
        println(s"Files count: $filesCount")
        println(s"Time take: ${(end - start) / 1.0e9 } seconds")
        context.system.terminate()
      }

   }

}






