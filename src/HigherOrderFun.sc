object HigherOrderFun {

  val double = (i: Int) => i * 2

  def higherOrder(x: Int, y: Int => Int) = y(x)

  higherOrder(6, double)

  val triple = (i: Int) => i * 3

  higherOrder(6, triple)

  var inc = (x: Int) => x + 1

  var z = inc(7)

  def sayHello = (name: String) => "Hello " + name

  var message = sayHello("K C")

  var y = 5
  val multiplier = (x: Int) => x * y

  multiplier(6)
}
