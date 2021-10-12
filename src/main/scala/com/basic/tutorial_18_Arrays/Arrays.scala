package com.basic.tutorial_18_Arrays

import scala.Array._

// Array - data structure which can store fixed sized sequential element of same data type
object Arrays {

  val myArray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Int](5)
  val myArray3 = Array(1, 2, 5, 7, 9)

  def main(args: Array[String]): Unit = {
    myArray(0) = 20
    myArray(1) = 50
    myArray(2) = 10
    myArray(3) = 30

    println(myArray)
    println("-------------------")

    for (x <- myArray)
      println(x)
    println("-------------------")

    for (i <- 0 to (myArray.length - 1))
      println(myArray(i))
    println("-------------------")

    println(myArray3.length)
    println("-------------------")

    val result = concat(myArray, myArray3)
    for (x <- result)
      println(x)
    println("-------------------")
  }
}
