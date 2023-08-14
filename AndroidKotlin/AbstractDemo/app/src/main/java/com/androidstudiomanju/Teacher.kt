package com.androidstudiomanju

class Teacher(name:String) : Person() {
    override var age : Int = 35
    var name : String = "Dev"
    override fun displayAge() {
        println("$name of $age")
    }
    override fun displayGreetings() {
        println("Good wishes $name")
    }

    override fun toString(): String {
        return "Teacher(age=$age, name='$name')"
    }

}