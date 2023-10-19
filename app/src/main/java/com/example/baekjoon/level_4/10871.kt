package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine()) // 입력받는 st를 따로 만들어줘야 함 (왜?..)

    for (i in 1..n) {
        val arr = st2.nextToken().toInt()
        if (arr < x) {
            bw.write("$arr ")
        }
    }
    bw.flush()
    bw.close()
}