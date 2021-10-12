package com.basic.tutorial_21_Maps

object Maps {

  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "July", 804 -> "June")
  val myMap2: Map[Int, String] = Map(805 -> "Luna")


  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(804))
    println(myMap.keys)

    myMap.keys.foreach { key =>
      println("key: " + key + ", value: " + myMap(key))
    }

    println(myMap.contains(80000))

    println(myMap ++ myMap2)
  }
}
