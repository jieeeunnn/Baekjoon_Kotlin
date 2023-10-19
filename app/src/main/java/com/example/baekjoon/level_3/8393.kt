package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var sum = 0

    for (i in 1..n) {
        sum += i
    }
    print(sum)
}