package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

// 코드 길이는 위 코드 길이가 더 긴데 메모리는 더 적게 사용함

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val a = readLine().toInt()
    val b = readLine().toInt()

    println(a*(b%10))
    println(a*((b%100)/10))
    println(a*(b/100))
    println(a*b)
}

/*
fun main() {
    val a = readLine()?.toInt()
    val b = readLine()?.toInt()

    if (a != null) {
        if (b != null) {
            println(a*(b%10))
            println(a*((b%100)/10))
            println(a*(b/100))
            println(a*b)
        }
    }

}

 */

