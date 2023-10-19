package com.example.baekjoon.level_5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

// 코드1 (내가 짠 코드)
/*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val arr = ArrayList<String>()

    for (i in 1..t) {
        val (r:String, s:String) = br.readLine().split(" ")
        for (a in 1..s.length) {
            var b = 1
            while (b < r.toInt() || b == r.toInt()) {
                arr.add(s[a-1].toString())
                b++
                if (b > r.toInt()) break
            }
        }
        bw.write(arr.joinToString("") + "\n")
        arr.clear()
    }
    bw.flush()
    bw.close()
}

 */


// 코드2 - 구글링

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 1..t) {
        val (r: String, s: String) = br.readLine().split(" ")
        var result = ""

        for (a in 1..s.length) {
            repeat(r.toInt()) {
                result += s[a - 1]
            }
        }
        bw.write(result + "\n")
    }

    bw.flush()
    bw.close()
}

/*
repeat을 사용하면 더 간단하게 풀 수 있었다
그리고 result를 for문 안에 선언하면 문자열을 clear하는 등의 번거로움을 줄일 수 있음!!
 */
