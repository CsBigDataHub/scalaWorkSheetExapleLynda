package com.chetan.Class3Challange

object Class3Challenge extends App {

  val myArray = Array(1, 2, 3, 4, 5);
  var sum = 0
  for (a <- myArray) sum += a

  println("Average of sum is " + (sum / myArray.length))

  def averageOfArray(myArrays: Array[Int]): Any = {
    var sumOfArray = 0
    for (a <- myArrays) sumOfArray += a
    "Average value is " + sumOfArray / myArrays.length
    "Sum of the Array is " + sumOfArray
  }

  println(averageOfArray(Array(1, 2, 3, 4, 5)))

  def minAndMaxOfArray(myArrays: Array[Int]) = {
    println("Minimum Value is " + myArrays.min)
    println("Maximum value is " + myArrays.max)
  }

  minAndMaxOfArray(Array(1, 2, 3, 4))

}
