package com.androidstudiomanju.sealeddemo

sealed class Demo{
    class A :Demo() {
        fun display() {
            println("Subclass A of Sealed class Demo")
        }
    }
        class  B : Demo(){
            fun display() {
                println("Subclass B of Sealed class Demo")
            }
        }
    }
fun main(args:Array<String>){
    val obj = Demo.B()
    obj.display()
    val obj1 = Demo.A()
    obj1.display()
}

