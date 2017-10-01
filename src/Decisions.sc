object Decisions {
  var a = 5
  var b = if (a < 0) -1 else 1
  println(b)

  //We can include if statement inside a print line statement

  println(
    if (b < 0) "the value is negative"
    else if (b == 0) "0"
    else "b is positive")

  //calculating a salary
  var rate = 10.50

  def earnings(jobType: String, hours: Double): String = {
    if (jobType != "fullTime") {
      if (hours <= 40) {
        "Salary is: $" + hours * rate
      } else {
        "salary is : $" + ((40 * rate) + ((hours - 40) * (rate * 1.5)))
      }
    }
    else {
      "This is a salaries emplopyee"
    }
  }

  println(earnings("partTime", 30))
  println(earnings("partTime", 40))
  println(earnings("partTime", 45))
  println(earnings("fullTime", 40))


}


