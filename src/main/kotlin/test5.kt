package org.example

fun test5() {
    /*
    0≤A,B,C≤50
    A+B+C≥1
    50≤X≤20,000
    A,B,C は整数である
    X は 50 の倍数である
    入力
入力は以下の形式で標準入力から与えられる。

A
B
C
X
出力
硬貨を選ぶ方法の個数を出力せよ。
    */
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()

    var count = 0
    for (i1 in 0..a) {
        for (i2 in 0..b) {
            for (i3 in 0..c) {
                val yen = i1 * 500 + i2 * 100 + i3 * 50
                if (yen == x) {
                    count++
                }
            }
        }
    }
    println(count)
}