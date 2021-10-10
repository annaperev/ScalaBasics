package com.basic.tutorial_10_Match

object Match extends App {
  val age = 100

  age match {
    case 18 => println(age)
    case 20 => println(age)
    case 30 => println(age)
    case 40 => println(age)
    case _ => println("default")
  }

  // as expression
  val result = age match {
    case 18 => age
    case 20 => age
    case 30 => age
    case 100 => age
    case _ => "default"
  }
  println(result)

  age match {
    case 10 | 100 => println("10 | 100")
    case 20 | 30 => print ("20 | 30")
  }
}
