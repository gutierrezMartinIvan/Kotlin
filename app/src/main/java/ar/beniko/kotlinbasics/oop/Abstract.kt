package ar.beniko.kotlinbasics.oop

abstract class Mammal(private var name: String, private var origin: String, private var weight: Double) {

    protected abstract var maxSpeed: Double

    abstract fun run()
    abstract fun breath()

    fun displayDetails(): String {
        return "Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed"
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double):
    Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double):
Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main() {
    val human = Human("Denis", "Russia", 80.0, 29.0)
    val elephant = Human("Rosy", "USA", 8053.0, 22.0)

    human.breath()
    human.run()
    elephant.breath()
    elephant.run()
    println(human.displayDetails())
    println(elephant.displayDetails())

}