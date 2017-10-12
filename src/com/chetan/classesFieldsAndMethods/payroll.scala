package com.chetan.classesFieldsAndMethods

object payroll extends App {

  var e1 = new Employee("Sam", "olson")
  var e2 = new Employee("john", "smith", salaried = 'y')
  println(e1.toString)
  println(e2.toString)
  println(e1.fullName)
  println(e2)

}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {

  def fullName: String = fName + " " + lName + ("\n" + "=" * 20)
  var employeeId = Employees.newEEID()

  override def toString =
    "EmployeeId:" + employeeId + " \nEmployee name: " + fName + " " + lName + (if (salaried == 'n')
                                                                                 "\n Hourly Emplyee"
                                                                               else
                                                                                 "\nSalaried Employee") + ("\n" + "=" * 20)

  //override def toString="Employee name: "+fullName+" "+(if(salaried=='n') "\n Hourly Emplyee" else "\nSalaried Employee")+("\n"+"="*20)
}
//this is a singleton object/class (this is similar to static keyword in Java )
object Employees {
  var employeeID = 0
  def newEEID() = {
    employeeID += 1
    employeeID
  }
}
