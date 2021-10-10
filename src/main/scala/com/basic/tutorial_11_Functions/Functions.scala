package com.basic.tutorial_11_Functions

object Functions {

  class MathClass{
    def add(x: Int, y: Int): Int = x + y
  }

  object Math{
    def add(x: Int, y: Int): Int = x + y
    def square (x: Int): Int = x*x
  }

  def add(x: Int, y: Int): Int =
    x + y //skip word "return", last line consider to be a return

  def subtract(x: Int, y: Int): Int = x - y

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int): Int = x / y

  def main(args: Array[String]): Unit = {
    val mathClass = new MathClass;
    println(mathClass.add(45, 15))

    println(Math.add(45, 15))
    println(Math.square(3))
    println(Math square  3)

    println(add(45, 15))
    println(subtract(45, 15))
    println(multiply(45, 15))
    println(divide(45, 15))
  }
}
