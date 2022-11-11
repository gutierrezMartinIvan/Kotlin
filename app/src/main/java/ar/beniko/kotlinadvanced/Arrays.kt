package ar.beniko.kotlinadvanced

fun main() {

    var numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    var numbers2 = intArrayOf(1, 2, 3, 4, 5, 6)

    var numbers3 = arrayOf(1, 2, 3, 4, 5, 6)

    println(numbers.contentToString())

    var fruits = arrayOf(Fruit("Apple", 34.4), Fruit("Banana", 312.4))
    println(fruits.contentToString())

    for (index in fruits.indices){
        println("${fruits[index].getName()} is in index $index")
    }
}

data class Fruit(private var name: String, private var price: Double) {
    fun getName(): String {
        return name
    }
}