
val list = List(1, 2, 3, 4, 5)

// map function:
println(list.map(_ + 1))
println(list.map(_ + " is a number"))

// filter
println(list.filter(x => x % 2 == 0))

// flatMap
val toPair: Int => List[Int] = (x: Int) => List(x, x+1)
println(list.flatMap(toPair))
println(list.map(toPair)) // VS map

// print all combinations between two example
val numbers = List(1, 2, 3, 4)
val chars = List('a', 'b', 'c', 'd')
val colors = List("black", "white")
// List('a1', 'a2', ... 'd4')
chars.flatMap(c => numbers.map(n => "" + c + n))
chars.flatMap(c => numbers.flatMap(n => colors.map(col => "" + c + n + col)))

// if you need two loops you translate tu map and flatMap

// for-comprehension
val forCombinatiors = for {
  n <- numbers
  c <- chars
  col <- colors
} yield ("" + c + n + col)

println(forCombinatiors)




























