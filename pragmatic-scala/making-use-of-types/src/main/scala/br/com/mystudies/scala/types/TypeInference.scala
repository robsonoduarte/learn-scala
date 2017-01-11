package br.com.mystudies.scala.types

object TypeInference extends App {


  val v1 : String = "v1" // indicate the type of properties

  val v2 = "v2" // don't indicate the type of properties than the compiler inference it


  // check the types

  println(v1)
  println(v1 getClass)
  println("-----------------------------")
  println(v2)
  println(v2 getClass)

}





// to confirm if Scala inferred the type in compile time or runtime
class TypeInferred{
  val v3 = "Ahoy"
}

/*

See the byte code to sure the type

$ javap -p TypeInferred.class
Compiled from "TypeInference.scala"
public class br.com.mystudies.scala.types.TypeInferred {
  private final java.lang.String v3;
  public java.lang.String v3();
  public br.com.mystudies.scala.types.TypeInferred();
}
*/