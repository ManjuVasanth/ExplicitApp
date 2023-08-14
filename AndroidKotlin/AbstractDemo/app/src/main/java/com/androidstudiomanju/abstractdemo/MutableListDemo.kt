package com.androidstudiomanju.abstractdemo

fun main(){
    // Immutable list
    var list = listOf<String>("Akshayaa","Aditi")
    for(item in list){
        println(item)
    }
    var list1 = arrayListOf<Int>(23,23,34,456,674,82)
    list1.add(37)
    for (i in list1){
        println(i)
    }
    var immMap = mapOf(1 to "Akshayaa",
        2 to "Aditi")
    for(key in immMap.keys){
        println(immMap[key])
    }
}