package com.basic.tutorial_13_HigherOrderFunctions

// Higher Order Functions can take functions as an arguments and return functions as result
object HigherOrderFunctions {

  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def math3(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    println(math(50, 20, (x, y) => x + y))
    println(math(50, 20, (x, y) => x * y))
    println(math(50, 20, (x, y) => x min y))
    println(math(50, 20, (x, y) => x max y))
    println("-----------------------------")

    println(math3(50, 20, 10, (x, y) => x + y))
    println(math3(50, 20, 10, _ + _)) // _ is wildcard
    println(math3(50, 20, 10, _ * _))
    println(math3(50, 20, 10, _ min _))
  }
}
