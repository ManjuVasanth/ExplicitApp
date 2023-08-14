package com.androidstudiomanju

abstract class Person {
    open var age:Int = 30
    open fun displayAge(){
        println("Display")
    }
    abstract fun displayGreetings()
}