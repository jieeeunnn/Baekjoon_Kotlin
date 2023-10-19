package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (a:Int, b:Int, c:Int) = readLine().split(" ").map { it.toInt() }
    println((a+b)%c)
    println(((a%c) + (b%c)) % c)
    println((a*b)%c)
    print(((a%c)*(b%c)) % c)
}