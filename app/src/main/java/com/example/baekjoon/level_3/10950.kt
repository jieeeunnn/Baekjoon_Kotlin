package com.example.baekjoon.level_3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var t:Int = readLine().toInt()

    for (n in 1..t) {
        var (a:Int, b:Int) = readLine().split(" ").map{it.toInt()}
        println(a+b)
    }
}