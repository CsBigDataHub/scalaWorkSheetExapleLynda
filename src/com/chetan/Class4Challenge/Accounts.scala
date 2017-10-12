package com.chetan.Class4Challenge

object Accounts extends App {
  var acc1=new BankAccount("James",100.00,accountType = 'C')
  var acc2=new BankAccount("Jim",1000.00,accountType = 'S')
  //println(acc1)
  //println(acc2)
  //List(acc1,acc2).foreach(println)
}

class BankAccount(val clientName: String,
                  var balance: Double,
                  val accountType: Char = 'C') {
  println("AccountId = " + AccountId.newAccountId + "\nAccountHolderName = " + clientName + "\nBalance = " + balance + "\nAccountType = " + (if(accountType=='C') "Checking Account" else "Savings Account" )+ ("\n" + "*" * 20))
  //override def toString =
    //"AccountId = " + AccountId.newAccountId + "\nAccountHolderName = " + clientName + "\nBalance = " + balance + "\nAccountType = " + (if(accountType=='C') "Checking Account" else "Savings Account" )+ ("\n" + "*" * 20)
}

object AccountId {
  var newAccountId = 5000
  def accountId = {
    newAccountId += 1
    newAccountId
  }
}
