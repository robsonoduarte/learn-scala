package br.com.mystudies.scala.types

object ImplicitConversions extends App {


}



object MyInterpolator{

  implicit class Interpolator(val context: StringContext) extends AnyVal{

    def mask(args: Any*) = {

    }

  }

}