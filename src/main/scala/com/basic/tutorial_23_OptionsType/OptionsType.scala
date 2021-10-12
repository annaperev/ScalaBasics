package com.basic.tutorial_23_OptionsType

object OptionsType {
  val list = List(1, 2, 3)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
  val opt: Option[Int] = Some(5) // or = None

  def main(args: Array[String]): Unit = {
    println(list.find(_ > 6))
    println(list.find(_ > 2))
    println(list.find(_ > 2).get)

    println(map.get(2))
    println(map.get(2).get)
    println(map.get(5))
    // println(map.get(5).get) // will give an exception
    println(map.get(5).getOrElse("No name found"))

    println(opt.isEmpty)
  }
}
