package ar.beniko.kotlinbasics

fun main() {
    var season = 3
    when(season){
        1 -> println("Spring") 2 -> println("Summer") 3 -> println("Yes you can put all the conditions in a row")
    }

    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Yes you can also use curly brackets on a condition")
            println("Hello mama")
        }
        else -> println("Default value")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        else -> println("Winter")
    }
    when(month) {
        in 5 downTo 3 -> println("Spring")
        in 8 downTo 6 -> println("Summer")
        in 11 downTo 9 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    var age = 54
    when(age) {
        in 16..17 -> println("You may drive now")
        in 18 .. 20 -> println("You may vote now")
        !in 0.. 20 -> println("You may drink now in the US")
        else -> println("You are too young")
    }

    var x: Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
    }
}