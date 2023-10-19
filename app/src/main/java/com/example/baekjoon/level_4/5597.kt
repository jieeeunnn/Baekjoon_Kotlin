package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayListOf<Int>()
    val result = arrayListOf<Int>()

    for (i in 1..28) {
        val st = StringTokenizer(br.readLine())
        arr.add(st.nextToken().toInt())
    }
    for (i in 1..30) {
        if (i !in arr) {
            result.add(i)
        }
    }

    bw.write(result.joinToString("\n"))
    bw.flush()
    bw.close()
}