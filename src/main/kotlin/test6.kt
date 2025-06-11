package org.example

fun test6() {
//    実行時間制限: 2 sec / メモリ制限: 256 MiB
//
//    配点 :
//    200 点
//
//            問題文
//    1 以上
//    N 以下の整数のうち、
//    10 進法での各桁の和が
//    A 以上
//    B 以下であるものの総和を求めてください。
//
//    制約
//    1≤N≤10 ** 4
//
//    1≤A≤B≤36
//    入力はすべて整数である
//    入力
//    入力は以下の形式で標準入力から与えられる。
//
//    N A B
//    出力
//    1 以上 N 以下の整数のうち, 10 進法での各桁の和が A 以上 B 以下であるものの総和を出力せよ。
    // 入力読み込み
    val (N, A, B) = readLine()!!.split(" ").map { it.toInt() }

    var totalSum = 0

    // 1からNまでの各整数について処理
    for (i in 1..N) {
        val digitSum = calculateDigitSum(i)
        // 各桁の和がA以上B以下の場合、総和に加算
        if (digitSum in A..B) {
            totalSum += i
        }
    }

    println(totalSum)
}

// 数値の各桁の和を計算する関数
fun calculateDigitSum(number: Int): Int {
    var sum = 0
    var n = number

    while (n > 0) {
        sum += n % 10  // 一番右の桁を取得して加算
        n /= 10        // 一番右の桁を除去
    }

    return sum
}