/**
 * 1
 * 1 1
 * 2 1
 * 1 2 1 1
 * 1 1 1 2 2 1
 * 3 1 2 2 1 1
 * ...........
 * */

/*
  Concatenation of list:
    1 :: 2 :: Nil // a list
    list1 ::: list2  // concatenation of two lists
 */

// what, current

// [count, what] - two elements: (acc, current)
def nextLine(currentLine: List[Int]): List[Int] = {
  // add terminate symbol
  val addedList = (Int.MaxValue :: currentLine).reverse

  // How with types??
  //currentLine.reduceLeft[(Int, Int, List[(Int, Int)])] { case ((acc, count, res), curr) => {
  addedList.foldLeft((0, 0, List.empty[(Int, Int)])) { case ((acc, count, res), curr) => {
    println(s"acc: $acc     curr: $curr")

    if (acc == curr) (acc, count + 1, res)
    else if(count > 0) (curr, 1, (count, acc) :: res)   // if not first element
    else (curr, count+1, res)   // simple pass first element
  }
  }._3.flatten{ case(x, y) => List(x, y)}   // TODO: what about better??
}

val line = List(1, 2, 1, 1)
//val res = nextLine(line)

val res: List[(Int, Int)] = List((1,1), (1,2), (2,1))
// res.flatten

res.flatMap(t => List(t._1, t._2))

res.flatten( x =>  Iterable(x._1, x._2))
res.flatten{ case(x, y) => List(x,y) }


/////////////

val ll = List((1,1), (1,2), (2,1))

//ll.flatten

ll.flatMap(t => List(t._1, t._2))

ll.flatten( x =>  Iterable(x._1, x._2))
ll.flatten{ case(x, y) => List(x,y) }

// TODO: what is better for List[Touples] -> List[]?

//////////////
// collect:

ll.collect{ case x => List(x._1, x._2)  }



val myFlatten:PartialFunction[Double,Double] = { case n if n > 0 => math.sqrt(n) }





val sqRoot:PartialFunction[Double,Double] = { case n if n > 0 => math.sqrt(n) }

sqRoot(10)

// partialFunctions - об
List(-1.1,2.2,3.3,0).collect(sqRoot)

























