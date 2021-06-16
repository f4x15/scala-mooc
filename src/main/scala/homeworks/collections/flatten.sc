
//val ll = List(List(1, 2, 3), List(4, 5, 6, 7, 8), List(9, 0))
val lt: List[(Int, Int)] = List((1, 2), (4, 5), (9, 0))

//ll.flatten

// lt.flatten   // no implicit found

lt.flatMap((x => List(x._1, x._2)))
lt.map(x => x._1) ++ lt.map(x => x._2)


lt.flatten{case (x, y) => List(x, y)}

lt.flatten{case (x, y) => Seq(x, y)}

