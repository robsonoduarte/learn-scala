package br.com.mystudies.scala
import scala.reflect.BeanProperty

class Student {

  @BeanProperty var name = ""  // why not var name: String
  @BeanProperty var id = 0     // and var id: Int

  //in Scala because all fields in class must is initialized

}