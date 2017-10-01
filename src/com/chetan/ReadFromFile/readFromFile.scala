package com.chetan.ReadFromFile

import io.Source._
object readFromFile extends App {
  val fileName =
    "/home/mypc/IdeaProjects/WorkSheetExample/src/com/chetan/ReadFromFile/rainbow.txt"

  for (line <- fromFile(fileName).getLines()) {
    println(line.toUpperCase)
  }

  val poemLine =
    fromFile("src/com/chetan/ReadFromFile/poem.txt").getLines().toList
  poemLine.foreach(println)
  println("#############################")
  var poemLines = fromFile("src/com/chetan/ReadFromFile/poem.txt").getLines()
  for (poem <- poemLines) {
    println(poem)
  }

}
