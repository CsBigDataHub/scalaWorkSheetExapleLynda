object Loops {
  var x = 10
  while (x >= 0) {
    println(x)
    x = x - 1 // same as x-=1
  }

  x = 10
  do {
    println(x)
    x -= 1
  } while (x >= 0)

  x = 10

  for (x <- 10 to 0 by -1) {
    println(x)
  }

  var y = for (num <- 1 to 10) yield num + 1

  var word = "Monday"
  for (x <- 0 until word.length) {
    println(word(x))
  }

  //This is how you can pass a variable lenght of arguments in scala
  def sum(args: Int*) = {
    var res = 0
    for (arg <- args) res += arg
    res
  }

  sum(1, 2, 3, 4)

  // the below is called functional looping
  val result = (1 to 100).reverse.mkString(",")
  val result1 = (100 to 1 by -1).mkString(";")
  println(result)
  println(result1)

  val xs = List(1, 2, 3, 4)
  var result2 = List[Int]()
  for (a <- xs) {
    result2 = result2 :+ (a + 1) //This here is operator over loading
  }
  println(result2) // result2 is List(2, 3, 4, 5)

  //fuctional For loops(For comprehension)
  val result3 = for (a <- xs) yield (a + 1)
  println(result3)
} // <console>:1: error: eof expected but '}' found.
//        }
//        ^
