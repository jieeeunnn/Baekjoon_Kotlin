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

    for (a in 1 ..m) {
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() }
        for (b in i-1 until j){
            arr[b] = k
        }
    }

    bw.write(arr.joinToString(" "))
    bw.flush()
    bw.close()
}