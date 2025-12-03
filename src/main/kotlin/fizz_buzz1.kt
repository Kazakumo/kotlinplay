package org.example

fun fizzBuzz1() {
    var i = readln().toInt()

    for (num in 1..i) {
        println(
            if (num % 15 == 0) "FizzBuzz"
            else if (num % 5 == 0) "Buzz"
            else if (num % 3 == 0) "Fizz"
            else num
        )
    }
}