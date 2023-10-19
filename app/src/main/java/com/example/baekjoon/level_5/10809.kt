package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val alphabet = IntArray(26) { -1 }

    for (i in s.indices) {
        if (alphabet[s[i].code - 97] == -1) {
            alphabet[s[i].code - 97] = i
        }
    }

    alphabet.forEach { bw.write("$it ") }
    bw.flush()
    bw.close()
}