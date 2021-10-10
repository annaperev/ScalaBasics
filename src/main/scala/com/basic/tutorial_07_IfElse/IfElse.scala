package com.basic.tutorial_07_IfElse

object IfElse extends App {
  // using as statement
  val x = 20
  var res = ""
  if (x == 20)
    res = "x == 20" else
    res = "x != 20"
  println(res)

  //using as expression
  val res2 = if (x==20) "x == 20" else "x != 20"
  println(res2)
  //or
  println(if (x==20) "x == 20" else "x != 20")
}
