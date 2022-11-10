package ar.beniko.kotlinbasics.oop

class MobilePhone(osName: String, brand: String, model: String){
    var battery: Int = 50
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(amount: Int): Int {
        println("Current battery: $battery")
        return if(battery+amount<=100) battery.plus(amount) else battery.plus(amount.minus(amount.minus(battery)))
    }
}

fun main(){
    var galaxyA51 = MobilePhone("Android", "Samsung", "Galaxy A51")
    println(galaxyA51.chargeBattery(60))
}