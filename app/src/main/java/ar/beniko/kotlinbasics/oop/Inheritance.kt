package ar.beniko.kotlinbasics.oop

fun main() {
    var electricCar = ElectricCar("301", "Reno", 180.00)
    electricCar.brake()

    var electricCar2 = ElectricCar("453", "Ford", 121.00)
    electricCar2.brake()
}

interface Drivable {
    var maxSpeed: Double
    fun drive(): String
    fun brake() = println("The drivable is braking")
}

open class Car(
    private var name: String, private var brand: String,
    override var maxSpeed: Double
) : Drivable {

    protected var range: Double = 0.0

    open fun extendRange(amount: Double): Double {
        return if (amount > 0) range.plus(amount) else throw java.lang.RuntimeException("Amount must be greater than 0")
    }

    override fun drive(): String {
        return "asasas"
    }
}

class ElectricCar(name: String, brand: String, maxSpeed: Double) : Car(name, brand, maxSpeed) {

    override fun extendRange(amount: Double): Double {
        return if (amount > 0) range.plus(amount.plus(1.0)) else throw java.lang.RuntimeException("Amount must be greater than 0")
    }

    override fun brake() {
        super.brake()
        println("override from electricCar")
    }
}