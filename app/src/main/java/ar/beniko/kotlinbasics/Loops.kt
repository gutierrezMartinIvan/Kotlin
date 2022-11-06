package ar.beniko.kotlinbasics

fun main(){
    var i = 0
    while (i < 20){
        //println(i++)
        i = 20
    }
    //println(i)

    for (num in 1 until 10){ // 1.until(10)
        println(num)
        //10 is not included
    }
    for (num in 1 .. 10){
        println(num)
        //10 is included
    }

    for (num in 10 downTo 1){
        println(num)
    }
    for (num in 10 downTo 1 step 2){
        println(num)
    }

    for (num in 10.downTo(1).step(2)){
        println(num)
    }
}