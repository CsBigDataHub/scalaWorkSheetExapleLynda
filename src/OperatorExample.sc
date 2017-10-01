object OperatorExample{

  var x =2
  var y = 9
  var sum = x+y
  //this is a binary operator 'and' in scala
  var b1 = x&y
  //this is a binary operator 'or' in scala
  var b2 = x|y
  //this is a binary operator 'exclusive or' in scala
  var b3 = x^y
  //this is a left shit operator this takes 0010 and gives 0100. so you are shifting he value by one. if it is then 0010 to 1000 in binary
  var b4 = x<<2

  val nums=1::2::3::Nil


  if (x>0 && y<0) "Both values are positive" else "one value is negative"

}