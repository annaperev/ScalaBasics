package com.basic.tutorial_16_FunctionCurrying

// Currying is technique of transforming a function
// that takes multiple arguments into a function
// that takes a single argument
object FunctionCurrying {
  def add(x: Int, y: Int) = x + y
  def add2(x: Int) = (y: Int) => x + y
  def add3(x: Int) (y: Int) = x + y

  def main(args: Array[String]): Unit = {
    println(add(20, 10))

    println(add2(20)(10))

    val sum40 = add2(40)
    println(sum40(100))

    println(add3(100)(200))

    // Use partial application with curring
    val sum50 = add3(50)_
    println(sum50(400))
  }
}
