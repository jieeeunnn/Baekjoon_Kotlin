package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = DoubleArray(n)
    val st = StringTokenizer(br.readLine())

    for (i in 1..n) {
        arr[i-1] = st.nextToken().toDouble()
    }
    println("arr 받은값: ${arr.joinToString(" ")}")

    val m = arr.max()
    println("arr 최댓값 m: $m")
    var sum = 0.0

    for (i in 1..n) {
        arr[i-1] = (arr[i-1] * 100) / m
        println("new arr : ${arr.joinToString(" ")}")
        sum += arr[i-1]
        println("sum : $sum")
    }

    bw.write("${sum/n}")
    bw.flush()
    bw.close()
}