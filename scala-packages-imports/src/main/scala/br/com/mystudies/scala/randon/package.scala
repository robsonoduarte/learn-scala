package br.com.mystudies.scala

import scala.util.Random

package object randon {

	val randon = new Random();

	def setSeed(seed: Int) = randon.setSeed(seed)

	def nextInt() = randon.nextInt
	def nextDouble() = randon.nextDouble

}