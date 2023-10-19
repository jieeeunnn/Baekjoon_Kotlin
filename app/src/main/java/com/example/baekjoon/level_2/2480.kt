package com.example.baekjoon.level_2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var (a:Int, b:Int, c:Int) = readLine().split(" ").map{it.toInt()}

    if(a==b && b==c && a==c) {
        print(10000+(a*1000))
    }
    else if(a==b || a==c){
        print(1000+(a*100))
    }
    else if(b==c){
        print(1000+(b*100))
    }
    else {
        print("${listOf(a,b,c).max()*100}")
    }
}