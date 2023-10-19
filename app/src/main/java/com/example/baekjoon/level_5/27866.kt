package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val i = br.readLine().toInt()

    val num = s.substring(0 until i)
    bw.write("${num.last()}")
    bw.flush()
    bw.close()
}