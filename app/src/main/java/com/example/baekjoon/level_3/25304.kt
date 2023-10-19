package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val x = readLine().toInt()
    val n = readLine().toInt()
    var sum = 0

    for (i in 1..n) {
        val (a:Int, b:Int) = readLine().split(" ").map { it.toInt() }
        sum += a*b
    }

    if (x == sum) print("Yes")
    else print("No")
}