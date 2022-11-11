package ar.beniko.kotlinadvanced

fun main() {

    var months = listOf("January", "February", "March")

    var mutableMonths = months.toMutableList()

    var moreMonths = arrayOf("April", "May", "June")

    mutableMonths.addAll(moreMonths)

    println(mutableMonths)

}