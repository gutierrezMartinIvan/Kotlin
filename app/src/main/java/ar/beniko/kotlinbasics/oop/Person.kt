package ar.beniko.kotlinbasics.oop

fun main(){
    var person1 = Person("Beniko", "Beniko")
    var person2 = Person()
    var person3 = Person(lastName = "Killua")
}

class Person (firstName: String? = null, lastName: String = "Values"){
    //Initializer block
    init {
        println("$firstName $lastName")
    }
}