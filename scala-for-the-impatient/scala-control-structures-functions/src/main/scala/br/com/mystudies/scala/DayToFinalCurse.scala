package br.com.mystudies.scala

import java.time.temporal.ChronoUnit
import java.time.LocalDate

object DayToFinalCurse extends App {


  println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2018, 8, 1)))
}