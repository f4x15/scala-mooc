package homeworks.collections

object Main extends App {

  // print all combinations between two example
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")
  // List('a1', 'a2', ... 'd4')
  chars.flatMap(c => numbers.flatMap(n => colors.map(col => "" + c + n + col)))

  // if you need two loops you translate tu map and flatMap

  // for-comprehension
  val forCombinatiors = for {
    n <- numbers
    c <- chars
    col <- colors
  } yield ("" + c + n + col)

  println(forCombinatiors)
}
