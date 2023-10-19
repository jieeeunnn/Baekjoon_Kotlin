package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var line : String?

    while (br.readLine().also { line = it } != null) {
        val st = StringTokenizer(line)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("${a+b}\n")
        bw.flush()
    }
    bw.close()
}