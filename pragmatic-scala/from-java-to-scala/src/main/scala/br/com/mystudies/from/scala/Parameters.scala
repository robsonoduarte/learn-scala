package br.com.mystudies.from.scala



object Parameters extends App {

    def max (values: Int*) = println(values.foldLeft(values(0))(Math.max)) // -> ((a,b) => Math.max(a,b))

    max(11,3,10)
    max(0,3,10, 20, -1, 4)


    def function(input: Int*) = println(input.getClass)

    function(1,2,3,4,5)



    val numbers = Array(1,2,3,4,5)
    //max(numbers) -> the error of type incompatibility the parameter is Int not Array

    // but we can pass the array using the explode notation
    max(numbers: _*)




    // Providing Default Values for Parameters

    def mail(destination: String = "head office", mailClass : String = "first") = println(s"sending to $destination by $mailClass class")


    mail("Houston office", "Priority")
    mail("Boston office")
    mail()
    mail("Priority") // -> scala's compiler using the position parameters to substitute the default value

    // but we can use the named arguments to resolve the problem above
    mail(mailClass = "Priority")
    mail(mailClass = "Priority", destination = "São Paulo Office")


}