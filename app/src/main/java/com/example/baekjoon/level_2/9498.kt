package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

/*
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    if (90<= a && a <= 100) println("A")
    else if ( 80 <= a && a < 90) println("B")
    else if (70 <= a && a < 80) println("C")
    else if (60 <= a && a < 70) println("D")
    else println("F")
}
 */


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()

    print(
        when {
            a >= 90 -> "A"
            a >= 80 -> "B"
            a >= 70 -> "C"
            a >= 60 -> "D"
            else -> "F"
        }
    )
}