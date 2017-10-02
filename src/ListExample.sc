object listExample {
  //charachters in list are converted to its ascii values, like below 'a' is converted to its ascii value 97
  var l = List(3.0, 5, 'a', 'B')
  var l2 = 1 :: 2 :: 3 :: 4 :: "nice" :: Nil
  var l3 = List.range(0, 10)
  //to merge two list we use ':::'
  var l4 = l ::: l2

  var sum = 0
  l3.foreach(sum += _)
  println(sum)

  val list = List((1, 2), (3, 4), (5, 6))

  var addedList = for ((a, b) <- list) yield a + b
}
