package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (h:Int, m:Int) = readLine().split(" ").map { it.toInt() }

    /*
    if (0<h && m>45) print("$h ${m-45}")
    else if (0<h && m<45) print("${h-1} ${60-(45-m)}")
    else if (h<1 && m<45) print("23 ${60-(45-m)}")
     */

    if (m < 45) {
        h--
        m = 60-(45-m)
        if (h<0) {
            h = 23
        }
    } else {
        m -= 45
    }

    print("$h $m")
}