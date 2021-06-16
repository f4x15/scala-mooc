// from: `Programming in Scala, 4ed`

val str = 1 #:: 2 #:: 3 #:: LazyList.empty

str
str.foreach(println)

str.head
str.tail

def fromFib(a: Int, b: Int): LazyList[Int] =
  a #:: fromFib(b, a + b)

val fibs = fromFib(1, 1).take(7)    // take = select 7 elements
fibs.toList                         // evaluate it

///////////////

def repeate: LazyList[Int] =
  LazyList[Int](1, 2) #::: (repeate)

repeate.take(2).foreach(println)
// w/o take - infinity loop

///////////////

def test: LazyList[Int] =
  LazyList[Int](1) #::: (test)
