package com.chetan.ErrorHandling

import java.io._
import scala.io.Source._

object errorHandling extends App {
  try {
    for (line <- fromFile("noFile.txt").getLines())
      println(line.toLowerCase)
  } catch {
    case e: FileNotFoundException => println("The file is not found!")
    case _: Exception             => println("the program has an error")
  }
  try {
    var quotient = 10 / 0
  } catch {
    case e: ArithmeticException => println("cannot divide by zero!")
  }
}
