package br.com.mystudies.from.scala


package society {

    package professional{

        class Executive{
          private[professional] var workDetails = "workDetails"
          private[society] var friends = "friends"
          private[this] var secrets = "secrets"


          def help(another: Executive) = {
            println(another.workDetails)
            println(another.friends)
            //println(another.screts) don't compile
          }
        }

        class Assistant {
          def assist(anExcec: Executive)= {
            println(anExcec.workDetails)
            println(anExcec.friends)
          }
        }
    }


    package social {
      class Acquaintance{
         def socialize(person: professional.Executive) ={
           println(person.friends)
           // println(person.workDetails) don't compile
         }
      }
    }
}



