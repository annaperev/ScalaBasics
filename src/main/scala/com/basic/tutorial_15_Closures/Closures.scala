package com.basic.tutorial_15_Closures

// Closure - a function which uses one or more variables declared outside this function
object Closures {

  var number = 10; // this variable declared outside add anonymous function
  val add = (x: Int) => {
    number = x + number
    number
  }

  def main(args: Array[String]) = {
    println(add(20))

    number = 100
    println((add(20))) // when execute the closure it takes last value of variable

    println(number) // changes made inside the closure are passed back to the value
  }

}
