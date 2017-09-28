object Loops{
  var x=10
  while (x>=0){
    println(x)
    x=x - 1// same as x-=1
  }
  x=10
  do{
    println(x)
    x -= 1
  }while(x >= 0)

  x = 10

  for( x <- 10 to 0 by -1){
    println(x)
  }

  var y = for( num <- 1 to 10) yield num + 1

  var word = "Monday"
  for (x <- 0 until word.length){
    println(word(x))
  }

  //This is how you can pass a variable lenght of arguments in scala
  def sum(args: Int*) = {
    var res = 0
    for (arg <- args) res += arg
    res
  }

  sum(1, 2, 3, 4)
}                                                   // <console>:1: error: eof expected but '}' found.
                                                    //        }
                                                    //        ^
