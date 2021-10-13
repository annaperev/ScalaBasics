package com.basic.tutorial_27_AuxiliaryConstructors

class User(var name: String, var age: Int) {
  def this() {
    this("Tom", 28)
  }

  def this(name: String) {
    this(name, 29)
  }
}


object AuxiliaryConstructors {
  def main(args: Array[String]): Unit = {
    var user1 = new User("Max", 30)
    var user2 = new User
    var user3 = new User("Bob")
  }
}
