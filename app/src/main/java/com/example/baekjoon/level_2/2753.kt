package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    if (a%4==0 && (a%100 != 0 || a%400 == 0)) print("1")
    else print("0")
}