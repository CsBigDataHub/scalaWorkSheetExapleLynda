package com.chetan.PatternMatching

object patternMatching extends App {
  def greekAplabet(letter: Char): String = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      // '_' is a wild card
      case _ => "This is a invalied character"
    }
  }

  println("the greek letter for A is " + greekAplabet('A'))
  println("the greek letter for B is " + greekAplabet('B'))
  println("the greek letter for C is " + greekAplabet('C'))
  println("the greek letter for D is " + greekAplabet('D'))

  def max(x: Int, y: Int) = x > y match {
    case true  => x
    case false => y

  }
  println(max(5, 20))
  println("***********")
  println(max(50, 20))

}
