package ar.beniko.kotlinbasics

import java.util.*

fun main(){
    /*var name: String = "Beniko"
    // name = null -> Compilation ERROR

    var nullableName: String? = null
    //nullableName = null this gives error if I want to use the let method to print the lenght value of the null value

    //println(name.length)
    //println(nullableName?.length)

    nullableName?.let { println(it.length) }*/
    var nullableName: String? = null
    // ?: Elvis operator
    var name = nullableName ?: "Default value"
    println(name)
    nullableName = "Beniko"

    println(nullableName!!.lowercase(Locale.ROOT))
}