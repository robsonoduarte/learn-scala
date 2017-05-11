package br.com.mystudies.scala

object DecoratingWithTraits extends App{

  val apartmentApplication = new Check with CreditCheck with CriminalCheck
  println(apartmentApplication.check)

  val employmentApplication = new Check with CriminalCheck with EmploymentCheck
  println(employmentApplication.check)

}


abstract class Check{
  def check =  "Checked Application Details"
}

trait CreditCheck extends Check {
  override
  def check = s"Checked Credit... ${super.check}"
}

trait EmploymentCheck extends Check {
	override
	def check = s"Checked Employment... ${super.check}"
}

trait CriminalCheck extends Check {
	override
	def check = s"Checked Criminal Records... ${super.check}"
}

