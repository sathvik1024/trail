package com.example.trail1.kotlinegs

//fun main() {
//    var someLambda : (Int,Int) -> Int = {a:Int,b:Int ->a+b}
//    println(someLambda(10,20))
//}
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(2))
}