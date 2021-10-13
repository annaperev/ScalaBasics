package com.basic.tutorial_30_ScalaLazyEvaluation

object CallByValueAndCallByName {

  def method1(n: Int): Unit = {
    println("Method1")
    println(n)
  }

  def method2(n: => Int): Unit = { //call by name
    println("Method2")
    println(n)
  }

  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }

    method1(add(5, 6))
    method2(add(5, 6))
  }
}
