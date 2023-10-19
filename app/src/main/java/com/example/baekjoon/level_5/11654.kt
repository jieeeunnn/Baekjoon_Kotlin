package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    bw.write("${input[0].code}")
    // 아스키코드로 변경할 때 input은 string이기 때문에 반드시 char 타입으로 바꾸고 출력해야 함
    // 원래는 input[0].toInt()를 사용해서 아스키코드를 출력하지만 코틀린에서는 Char의 'code' 속성을 사용하는 것이 권장됨
    // 'code' 속성은 Char을 해당하는 아스키코드 또는 유니코드로 변환해줌
    bw.flush()
    bw.close()
}