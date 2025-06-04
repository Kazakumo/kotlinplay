package org.example

fun dev3() {
    val ss = readLine()!!.toCharArray().map { it.digitToInt() }.count{it == 1}
    println(ss)
}