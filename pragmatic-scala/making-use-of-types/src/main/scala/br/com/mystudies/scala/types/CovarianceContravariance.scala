package br.com.mystudies.scala.types

object CovarianceContravariance extends App {


  var arr1 = new Array[Int](3)
  var arr2: Array[Any] = _

  // arr2 = arr1 --> Scala will stop at compile time any conversions that may potentially lead to runtime failures

  // See the problems in CovarianceContravariance.java
  
  // By default Scala does not allow either one of them

/*

[error] CovarianceContravariance.scala:10: type mismatch;
[error]  found   : Array[Int]
[error]  required: Array[Any]
[error] Note: Int <: Any, but class Array is invariant in type T.
[error] You may wish to investigate a wildcard type such as `_ <: Any`. (SLS 3.2.10)
[error]   arr2 = arr1
[error]          ^
[error] one error found
[error] (compile:compileIncremental) Compilation failed
[error] Total time: 5 s, completed 19/01/2017 20:58:17


 */


}