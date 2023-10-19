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
        for (a in 1..t-i){ // 인터넷 풀이에선 downTo를 쓰기도 함
            bw.write(" ")
        }
        for (b in 1..i) {
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}