package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = IntArray(10)
    val arr2 = IntArray(10)

    for (i in 1..10) {
        val st = StringTokenizer(br.readLine())
        arr[i-1] = st.nextToken().toInt()
        val num = arr[i-1]%42
        arr2[i-1] = num
    }
    val arr3 = arr2.distinct()

    bw.write("${arr3.count()}")
    bw.flush()
    bw.close()
}