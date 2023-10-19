package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 1..t) {
        val word = br.readLine()
        bw.write("${word.first()}${word.last()}\n")
        // .first(), .last() 함수는 보통 collection에서 사용해서 이렇게 문자열을 출력할 때 사용해도 되는건지 모르겠음
        //bw.write("${word[0]}${word[word.lastIndex]}\n")
    }
    bw.flush()
    bw.close()
}