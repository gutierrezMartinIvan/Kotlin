package ar.beniko.kotlinbasics.oop

fun main() {
    var person1 = Person("Beniko", "Beniko", 324)
    //var person2 = Person()
    //var person3 = Person(lastName = "Killua")
    println(person1)
}

 class Person(firstName: String? = null, lastName: String = "Values") {
    private var hobby: String? = null
    private var age: Int? = null
    private var firstName: String? = firstName
    private var lastName: String? = lastName

    //Initializer block
    init {

    }

    // Secondary constructor
    constructor(firstName: String?, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    fun getHobby(): String? {
        return hobby
    }

    override fun toString(): String {
        return "Person(hobby=$hobby, age=$age, firstName=$firstName, lastName=$lastName)"
    }
}