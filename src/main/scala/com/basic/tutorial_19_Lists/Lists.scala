package com.basic.tutorial_19_Lists

// List - data structure which can store element of same data type
// Lists are immutable
// List represent the linked list
object Lists {

  val myList: List[Int] = List(1, 2, 3, 6, 3, 6, 8)
  val names: List[String] = List("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    // myList(0) = 5 // error: value update is not a member of List[Int]
    println(0 :: myList) // :: 	Cons, we prepend 0 to the List but don't change the List

    println(myList)
    println(names)

    println(1 :: 5 :: 9 :: Nil)
    println(myList.head)
    println(names.tail) // tail is all except the head
    println(myList.tail)
    println(names.isEmpty)
    println(myList.reverse)
    println(myList.max)

    myList.foreach(f => print(f))
    println()
    myList.foreach(print)
    println()

    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)

    for (name <- names){
      print(name)
    }
    println

    println(names(0))
  }
}
