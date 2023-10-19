package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var n:Int = readLine().toInt()

    for (a in 1..9) {
        println("$n * $a = ${n*a}")
    }
}