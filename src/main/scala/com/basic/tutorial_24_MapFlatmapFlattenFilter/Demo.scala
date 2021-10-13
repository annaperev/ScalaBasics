package com.basic.tutorial_24_MapFlatmapFlattenFilter

object Demo {
  val list = List(1, 2, 3, 4, 5)
  val myMap = Map(5 -> "Tom", 2 -> "Max", 3 -> "John")

  def main(args: Array[String]): Unit = {
    println(list.map(x => x / 0.2))
    println(list.map(x => "hi" * x))
    println(myMap.map(x => "hi" + x))
    println(myMap.view.mapValues(x => "hi" + x).toMap)
    println("hello".map(x => x.toUpper))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)
    println(list.map(x => List(x, x + 1)))
    println(list.flatMap(x => List(x, x + 1)))

    println(list.filter(x => x % 2 == 0))
  }

}
