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
    val st = StringTokenizer(br.readLine())
    var arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }
    bw.write("${arr.min()} ${arr.max()}")
    bw.flush()
    bw.close()
}