package com.basic.tutorial_14_PartiallyAppliedFunctions

import java.util.Date

object PartiallyAppliedFunctions {

  def log(date: Date, message: String) = {
    println(date + " " + message)
  }

  def main(args: Array[String]): Unit = {
    // AnonymousFunction
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    println(sum(10, 20, 30)) // Fully applied function

    // Partially applied functions
    val f = sum(10, 20, _: Int)
    println(f(30)) // 30 applied to wildcard _

    val j = sum(10, _: Int, _: Int)
    println(j(100, 200)) // 100 and 200 applied to wildcard _

    val date = new Date;
    val newLog = log(date, _: String);
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
  }
}
