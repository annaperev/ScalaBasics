package com.basic.tutorial_09_ForLoop

object ForLoop extends App{
  for (i <-1 until 3)
    println("i using until " + i )
  println("--------------------")

  for (i <- 1 to 3; j <- 1 to 2)
  println("i using multiple ranges " + " i: " + i + " j: " + j)
  println("--------------------")

  val list = List(1,4,7,19,3)
  for(i <- list)
  println("i using list " + i)
  println("--------------------")

  for (i <- list; if i < 6)
    println("i using list and filters " + i)
  println("--------------------")

  val result = for {i <- list; if i < 6} yield
    i * i
  println("for loop as expression, result " + result)
  println("--------------------")
}
