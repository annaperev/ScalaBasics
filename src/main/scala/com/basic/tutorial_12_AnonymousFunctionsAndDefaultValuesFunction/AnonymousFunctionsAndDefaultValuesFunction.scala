package com.basic.tutorial_12_AnonymousFunctionsAndDefaultValuesFunction

object AnonymousFunctionsAndDefaultValuesFunction {

  object Math {
    def add(x: Int = 45, y: Int = 15): Int = x + y
    def +(x: Int = 45, y: Int = 15): Int = x + y

    def square(x: Int): Int = x * x
    def **(x: Int): Int = x * x
  }

  // returning type Unit when does not return any value
  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }

  def main(args: Array[String]): Unit = {
    println(Math.add()) // use default parameter from add signature
    println(Math.add(60)) // takes 60 as first parameter and use default second parameter from add signature
    println(Math.+())
    println(Math square 3)
    println(Math.**(10))

    // AnonymousFunctions
    var add = (x: Int, y: Int) => x + y
    println(add(300,500))

  }
}
