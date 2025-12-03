package org.example

fun fizzBuzz2() {
    var a = readLine()
    a?.let {
        val b = a.toInt()
        (1..b).forEach { it ->
            val c = when (Pair(
                it % 3 == 0,
                second = it % 5 == 0,
            )) {
                Pair(true, true) -> "fizz buzz"
                Pair(false, true) -> "buzz"
                Pair(true, false) -> "fizz"
                else -> it
            }
            println(c)
        }
    }
}