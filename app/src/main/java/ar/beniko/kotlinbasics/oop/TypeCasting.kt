package ar.beniko.kotlinbasics.oop

import kotlin.math.floor

fun main(){
    var stringList: List<String> = listOf("Denis", "Frank", "Michael", "Garry")
    var mixedTypeList: List<Any> = listOf("Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for (value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double $value with Floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.toString().length}")
            else -> println("Unknown type")
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    when(obj1){
        !is String -> println("Not a String")
        else -> println("Found a String of lenght ${obj1.length}")  // obj is automatically cast to a String in this scope
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)

    // Explicit (safe) Casting using the "as)" keyword
    val obj3: Any = 144465
    val str3: String? = obj3 as? String // Works
    println(str3) // prints null
}