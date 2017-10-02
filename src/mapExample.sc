object mapExample {
  var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 -> "eggs")
  groceries = groceries + (5 -> "hashbrowns")
  groceries.get(3)
  groceries(3)
  //get's a key and if the key is not present , give a message
  groceries.getOrElse(6, "No Match")
  for (v <- groceries.values) println(v)

  //reversing key value pair
  var z = for ((k, v) <- groceries) yield (v, k)

  groceries.foreach(println)
}
