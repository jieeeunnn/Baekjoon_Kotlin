package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)

    for (a in 1 ..n) {
        arr[a-1] = a
    }

    for (b in 1..m){
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        val k = arr[i-1]

        arr[i-1] = arr[j-1]
        arr[j-1] = k
    }

    bw.write(arr.joinToString(" "))
    bw.flush()
    bw.close()
}