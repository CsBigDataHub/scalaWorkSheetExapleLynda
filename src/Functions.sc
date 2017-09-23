object Functions {
  def abs(x: Int) = {
    if (x < 0) x else "this is a positive no"
  }

  abs(5)

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) {
      r = r * i
      println(r)
    }
    r
  }

  fac(5)

  //the below is the same fsc function as above
  // this is  a RECURSION function
  def factorialOneLine(n: Int): Int = if (n <= 0) 1 else n * factorialOneLine(n - 1)

  factorialOneLine(5)

  def factorial(n: Int): Int = {
    println(n)

    if (n <= 0) {
      1
    } else {

      //println(n * factorial(n-1))
      n * factorial(n - 1)


    }

  }

  factorial(5)

  //This is a TAIL RECURSION function
  // read  https://www.scala-exercises.org/scala_tutorial/tail_recursion
  //see https://www.youtube.com/watch?v=wLRuAg0ZHt0
  def recursiveFunc(n: Int): Unit = {
    if (n > 0) {
      print(n + ", ")
      recursiveFunc(n - 1)
    }
    else {
      println(n + ".")
    }
  }

  recursiveFunc(4)

  def factorialTailRecursiveFunc(n: Int): Unit = {
    if (n <= 0) {
      println("1")
    } else {
      println(n * factorial(n - 1))
    }
  }

  factorialTailRecursiveFunc(5)

  //when defining a function you can define arguments with default values
  def printName(left: String = "[", fName: String, lName: String, right: String = "]"): Unit = {
    println(left + fName + " " + lName + right)
  }

  printName(fName = "Will", lName = "Smith")
  //you can rearrange the arguments when calling function in the way below
  printName(left = "<", lName = "Smith", fName = "Will", right = ">")

  //To pass variable lenght of arguments in scala
  def sum(args: Int*) = {
    var res = 0
    for (arg <- args) res += arg
    res
  }

  sum(1, 2, 3, 4, 5)


}