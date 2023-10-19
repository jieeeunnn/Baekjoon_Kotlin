package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a:Long, b:Long, c:Long) = readLine().split(" ").map { it.toLong() }
    print(a+b+c)
}