package com.androidstudiomanju

/*open class Person(var name: String, var age:Int) {
    init{
        println("The person name $name")
        println("The person age $age")
    }*/
open class Person{
    constructor(name:String, age:Int){
        
    }
    open fun walk(){
        println("Person able to walk")
    }
    open fun talk(){
        println("Able to talk ")
    }
}
class Teacher : Person{
       constructor(name:String,age:Int):super(name, age){

       }

    override fun walk(){
        println("Keeps on walking")
    }
    override fun talk(){
        println("Keeps on talking")
    }
}