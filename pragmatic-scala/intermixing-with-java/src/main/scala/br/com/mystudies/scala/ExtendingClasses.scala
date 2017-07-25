package br.com.mystudies.scala

object ExtendingClasses extends App {

  var bird = new Penguin // see the Penguin Java class

  bird.fly

}



abstract class Bird{
  @throws(classOf[NoFlyException]) def fly // use the annotations to Scala compiler place the necessary signature for the method, than we can use it in Java class
}

class Ostrich extends Bird{
  def fly = throw new NoFlyException
}


class NoFlyException extends Exception