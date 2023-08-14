package com.androidstudiomanju

import java.lang.reflect.Array.get

fun main() {
//    var greeting: String
//    greeting = "Hello Kotlin developers"
//    println(greeting.length)
//    println(greeting.indexOf("Kotlin"))
//    var c1 = Car("Ford",2022,"Red")
//    println(c1.brandName)
//    for (chars in 'a'..'x') {
//        println(chars)
//    }
//    for (numbers in 1..10) {
//        println(numbers)
//    }
//    val cars = arrayOf("Audi", "BMW", "Mercedes")
//    for (i in cars) {
//        println(i)
//    }
//   var result =  add(1,2)
//    println(result)
//    sayHello("Akshayaa and Aditi")
//}
//fun add(a:Int,b:Int):Int{
//    return(a+b)
//    // fun add(a:Int, b: Int) = a+b
//}
//fun sayHello(name : String){
//    println("Hello $name")
//}
   val teacher = Teacher("James",32)
   println(teacher.walk())
 println( teacher.talk())
    val person = Person("Jack",27)
    println(person.walk())
    println(person.talk())

   val fruit = Fruit()
   fruit.fruitName = "Mango"
   println(fruit.fruitName)
}
