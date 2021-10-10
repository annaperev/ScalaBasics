package com.allaboutscala.chapter.one.tutorial_04

object HelloWorld extends App {

  def sum(x: Int, y: Int): Int = {
    val result = x + y
    println(s"$result")
    x - y
  }

  println(sum(1, 2))
}