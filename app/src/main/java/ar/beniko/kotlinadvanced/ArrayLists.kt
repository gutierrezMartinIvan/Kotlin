package ar.beniko.kotlinadvanced

fun main() {

    val arrayList = arrayListOf("Banana", "Apple", "Grape", "Orange")
    arrayList.add("Mango")
    println(arrayList)

    val arrayList2: ArrayList<String> = ArrayList(5)
    var list: MutableList<String> = mutableListOf()

    list.add("One")
    list.add("Two")
    arrayList2.addAll(list)
    println(arrayList2)
}