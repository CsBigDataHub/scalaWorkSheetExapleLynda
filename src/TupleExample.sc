object TupleExample {
  val v = (1, 1.5, "Hello")
  var x = v._3

  val (first, secound, third) = v
  //the below statemet is similar to below
  val (one, two, three) = (1, 2, 3)

  println(one)

  val symbols = Array("<", "_", ">")
  val counts = Array(2, 10, 2)
  val pairs = symbols.zip(counts)

  for ((s, n) <- pairs) println(s * n)

  def divide10(n:Int):Tuple2[Int,Int] = {
    (n/10,n%10)
    //you can also do
    //return (n/10,n%10)
  }
  println(divide10(100))

  val(tens,ones) = divide10(100)
}
