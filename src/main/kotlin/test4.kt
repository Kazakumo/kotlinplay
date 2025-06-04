package org.example

fun test4 (){
    val n  = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    val counts = numbers.map { countDivisionsByTwo(it) }
    println(counts.min())
}

fun countDivisionsByTwo(x: Int): Int {
    var count = 0
    var num = x
    while (num % 2 == 0){
        num /= 2
        count ++
    }
    return count
}