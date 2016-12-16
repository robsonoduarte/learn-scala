package br.com.mystudies.scala

class CreditCard(val number: Int, var creditLimit: Int)



/*
 THE CLASS COMPILED

javap -private CreditCard
Warning: Binary file CreditCard contains br.com.mystudies.scala.CreditCard
Compiled from "CreditCard.scala"
public class br.com.mystudies.scala.CreditCard {
  private final int number;
  private int creditLimit;
  public int number();
  public int creditLimit();
  public void creditLimit_$eq(int);
  public br.com.mystudies.scala.CreditCard(int, int);
}
* */