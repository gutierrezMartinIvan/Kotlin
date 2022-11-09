package ar.beniko.kotlinbasics.oop

//data classes can not be abstract, open, sealed or inner classes
data class User(val id: Long, var name: String)



fun main(){
    val user1 = User(1, "Beniko")
    println(user1)

    val(id, name) = user1
    println("$id $name")
}