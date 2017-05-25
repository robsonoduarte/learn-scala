package br.com.mystudies.scala

object MethodNameConvention extends App {

  val cow = new Cow
  val moon = new Moon

  cow ^ moon
  cow ^: moon
  /* code above is the same --> */
  moon.^:(cow)




  // the unary operators
  val sample = new Sample

  +sample
  -sample
  !sample
  ~sample
}



class Cow{
  def ^(moon: Moon) = println("Cow jumped over the moon")
}

class Moon{
  def ^:(cow: Cow) = println("This cow jumped over the moon to")
}


class Sample {
  def unary_+() = println("Called unary + ")
  def unary_-() = println("Called unary - ")
  def unary_!() = println("Called unary ! ")
  def unary_~() = println("Called unary ~ ")
}
