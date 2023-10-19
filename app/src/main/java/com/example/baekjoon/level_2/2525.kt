package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var (a: Int, b: Int) = readLine().split(" ").map { it.toInt() }
    val c = readLine().toInt()
    var d = b+c

    a += (d / 60)
    if (a>23) {
        a -= 24
    }

    b += c-(60*(d/60))
/*
    if (d>59) {
        d -= 60
        if (d%60 == 0){
            d = 0
        }
    }
 */
    print("$a $b")
}