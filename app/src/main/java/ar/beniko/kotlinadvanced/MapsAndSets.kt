package ar.beniko.kotlinadvanced

fun main() {

    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits.toSortedSet())

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wesnesday")
    println(daysOfTheWeek[1])

    for (key in daysOfTheWeek.keys) {
        println("$key in ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf(1 to Fruits("Banana", 2.4), 2 to Fruits("apple", 2.4))
    println(fruitsMap)
}

data class Fruits(val name: String, val price: Double)
