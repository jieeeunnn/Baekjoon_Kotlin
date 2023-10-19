package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 1..t) {
        val (a:Int, b:Int) = br.readLine().split(" ").map { it.toInt() }
        bw.write("Case #$i: ${a+b}\n")
    }
    bw.flush()
    bw.close()
}