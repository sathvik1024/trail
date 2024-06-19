package com.example.trail1.kotlinexamples

fun main() {

    for (i in 1..5) print(i)
    printHello(name = "hello")
    drive(speed = "slow")
    tempToday("mon",32)
}

fun printHello(name: String?){
    println("hi hello")
}

fun drive(speed: String = "fast") {
    println("driving $speed")
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}
