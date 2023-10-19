package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = br.readLine()
    var sum = 0

    for (i in 1..n) {
        sum += arr[i-1].toString().toInt()
    }
    bw.write("$sum")
    bw.flush()
    bw.close()
}