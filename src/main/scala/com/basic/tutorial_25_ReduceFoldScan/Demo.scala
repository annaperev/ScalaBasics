package com.basic.tutorial_25_ReduceFoldScan

object Demo {

  val list = List(1, 2, 3, 5, 10, 13)
  val list2 = List("A", "B", "C")

  def main(args: Array[String]): Unit = {
    println(list2.reduceLeft(_ + _))
    println("--------------")
    println(list2.reduceLeft((x, y) => {
      println(x + ", " + y);
      x + y
    }))
    println("--------------")
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ - _))
    println("--------------")
    println(list.reduceRight((x, y) => {
      println(x + " - " + y);
      x - y
    }))
    println("--------------")
    println(list.reduceLeft(_ + _))
    println(list.foldLeft(100)(_ + _))
    println(list.foldLeft("z")(_ + _))
    println("--------------")
    println(list.scanLeft(100)(_ + _))
    println(list.scanLeft("z")(_ + _))
  }
}
