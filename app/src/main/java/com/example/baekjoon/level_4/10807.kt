package com.example.baekjoon.level_4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val v = br.readLine().toInt()

    bw.write("${arr.count{it == v}}")
    bw.flush()
    bw.close()
}

/*
fun main() {
    val intCount = readln().toInt()
    val nums = readln().split(" ")
    val wantFindNum = readln().toInt()
    println(nums.count { it.toInt() == wantFindNum })
}

 */