package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n:Int, m:Int) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)

    for (a in 1..n) {
        arr[a-1] = a
    }
    println("arr 초기값: ${arr.joinToString(" ")}")

    for (b in 1..m) {
        val (i:Int, j:Int) = br.readLine().split(" ").map { it.toInt() }
        arr.reverse(i-1, j) // reverse(fromIndex, toIndex) 함수는 fromIndex 부터 toIndex-1까지 순서를 뒤집어줌!
        println("arr: ${arr.joinToString(" ")}")
    }

    bw.write(arr.joinToString(" "))
    bw.flush()
    bw.close()
}