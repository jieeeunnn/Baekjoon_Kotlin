package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = IntArray(9)

    for (i in 0..8) {
        val st = StringTokenizer(br.readLine())
        a[i] = st.nextToken().toInt()
    }
    bw.write("${a.max()}\n${a.indexOf(a.max())+1}")
    bw.flush()
    bw.close()
}