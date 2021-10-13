package com.basic.tutorial_30_ScalaLazyEvaluation

class strict {
  val e = {
    println("strict")
    9
  }
}

class lazyEval {
  lazy val e = {
    println("lazy")
    9
  }
}

object ScalaLazyEvaluation {
  def main(agrs: Array[String]): Unit = {
    val x = new strict
    val y = new lazyEval

    println(x.e)
    println(y.e)
  }
}
