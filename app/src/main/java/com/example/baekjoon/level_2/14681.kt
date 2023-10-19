package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val x = readLine().toInt()
    val y = readLine().toInt()
    if (x > 0 && y > 0) print("1")
    else if (x < 0 && y > 0) print("2")
    else if (x < 0 && y < 0) print("3")
    else if (x > 0 && y < 0) print("4")
}