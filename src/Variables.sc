object Variables{
  var greetings = null
  var message:String = "hello"

  //var c,d = 124



  var a = 10.toString
  a+=" ten"
  println(a)
  println("Hello")

  var b = 10.15.toInt

  var ab = (1,2,(3,4))

  //declaring a array
  //https://www.journaldev.com/7915/scala-arrays-example
  var numbers: Array[Int] = new Array[Int](5)
  numbers = Array(23, 34, 45, 67, 78)
  println(numbers.length)

  for (i <- 0 until numbers.length) {
    println(numbers(i))

  }

}