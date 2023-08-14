package com.androidstudiomanju.abstractdemo

import java.util.Scanner

fun main(){

    var s1 = Scanner(System.`in`)
    print("Please enter first number")
    var x = s1.nextInt()
    var s2 = Scanner(System.`in`)
    print("Please enter second number")
    var y = s2.nextInt()
    val div = x/y
    val rem = x % y
    println("Division of 2 numbers $div")
    println("Remainder of 2 numbers $rem")
}