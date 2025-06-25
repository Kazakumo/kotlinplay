package org.example

fun test8() {
    val n = readLine()!!.toInt()
    var numbers = mutableSetOf<Int>()
    repeat(n) {
        val input = readLine()!!.toInt()
        numbers.add(input)
    }

    println(numbers.size)
}