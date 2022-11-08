package ar.beniko.kotlinbasics

fun main(){
    println(getAvg(10,9))
}

fun addUp(a: Int, b: Int) : Int{
    return a + b
}

fun getAvg(vararg marks: Int) : Double{
    return marks.average()
}