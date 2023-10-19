package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a:Int, b:Int) = readLine().split(" ").map { it.toInt() }

    if (a>b) {
        println(">")
    } else if (a<b) {
        println("<")
    } else {
        println("==")
    }
}