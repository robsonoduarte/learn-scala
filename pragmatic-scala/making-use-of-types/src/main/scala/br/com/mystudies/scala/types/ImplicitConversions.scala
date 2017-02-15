package br.com.mystudies.scala.types

object ImplicitConversions extends App {

  import MyInterpolator._

  val ssn = "123-45-6789"
  val account = "0246781263"
  val balance = "20145.23"


  println(mask"""Acount: $account
      |Social Securit Number : $ssn
      |Balance: $$^${balance}
      |Thanks for your business.""".stripMargin)

}



object MyInterpolator{

  implicit class Interpolator(val context: StringContext) extends AnyVal{

    def mask(args: Any*) = {
      val procesed = context.parts.zip(args).map{ item =>
        val(text,expression) = item

        if(text.endsWith("^"))
            s"${text.split('^')(0)}$expression"
         else
           s"$text... ${expression.toString takeRight 4}"
      }.mkString

      new StringBuilder(procesed).append(context.parts.last)
    }
  }

}