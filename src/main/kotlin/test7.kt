package org.example

fun test7() {
    val n = readLine()!!.toInt()
    val input = readLine()

    val numbers = input?.split(" ")?.mapNotNull { it.toIntOrNull() }!!.sortedByDescending { it }

    var alicePoint = 0
    var bobPoint = 0
    var isAliceTurn = true
    for (number in numbers) {
        if (isAliceTurn) {
            alicePoint += number
            isAliceTurn = false
        } else {
            bobPoint += number
            isAliceTurn = true
        }
    }
    println(alicePoint - bobPoint)

}