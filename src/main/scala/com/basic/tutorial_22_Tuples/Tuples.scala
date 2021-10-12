package com.basic.tutorial_22_Tuples

// Tuples - contains elements of different data types
// You can't change tuple size once it declared
object Tuples {

  val myTuple = (1, 2, "Hello", true)
  val myTuple2 = new Tuple4(1, 2, "Hello", true) // Tuple4 - with the number of elements, allowed up to 22
  val myTuple3 = new Tuple3(1, 2, ("Hello", true))

  def main(args: Array[String]): Unit = {
    println(myTuple)
    println(myTuple._2)

    println("-------------------")
    myTuple.productIterator.foreach(f => println(f))

    println("-------------------")
    println(1 -> "Tom") // this creates a tuple of 2 elements
    println(1 -> "Tom" -> true) // this creates a tuple of 2 elements one of which is tuple of 2 elements

    println("-------------------")
    println(myTuple3._3._2)
  }
}
