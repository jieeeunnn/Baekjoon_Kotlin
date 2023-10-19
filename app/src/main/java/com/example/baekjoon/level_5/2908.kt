package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a:String, b:String) = br.readLine().split(" ").map { it.reversed() }

    bw.write("${max(a.toInt(),b.toInt())}")
    bw.flush()
    bw.close()
}