object setExample {

  //refere to http://www.scala-lang.org/api/current/scala/collection/Set.html
  val fruit = Set("apple", "orange", "banana")

  var moreFruit = Set("kiwi", "pineapple")
  var nums = Set(1, 2, 3, 4, 5)
  var moreNums = Set(6, 7, 8, 9)
  //nums.com
  nums.contains(5)
  nums(3)
  //'++' is union of sets
  var mixed = fruit ++ nums

  nums -= 5
  println(nums)
  //'&' intersection of the set
  nums & moreNums

  moreFruit.head
  moreFruit.tail
  moreNums.isEmpty
}
