package com.basic.tutorial_26_Classes

class User

class User1(private var name: String, var age: Int) {
  // var or val in class variables are necessary if we want to use them outside the class
  // without var or val we can use variable only inside the class
  def printName{println(name)}
}
object Classes {
  def main(arg: Array[String]) {
    var user = new User
    var user1 = new User1("Max", 28)

    user1.printName
    println(user1.age)
    user1.age = 29
    user1.printName
    println(user1.age)


  }
}
