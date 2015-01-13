package br.com.mystudies.scala.higher.order.functions

import javax.swing.JButton
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import br.com.mystudies.java.Action
import br.com.mystudies.java.Task
import com.sun.xml.internal.fastinfoset.stax.events.Util

object SAMConversions extends App {


  // TODO: go back in this example after studies about implicit

    val task = new Task


    task.run(
          new Action{
            override def doSomething(){
                print("I am some action")
            }
          }
      )




      implicit def makeAction(action: (Action) => Unit)  = {
          new Action{
              override def doSomething(){}
          }
      }



    task run( (action: Action) => print("I am some action") )

}


