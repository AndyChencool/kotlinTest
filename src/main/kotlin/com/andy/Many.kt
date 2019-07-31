package com.andy

fun main() {
    val list = listOf(5,1,2,7)
    println(list)
    val scroes = listOf(68,88,77,99,50)
    for (score in scroes){
        println(score)
    }
    println(list.get(3))
    //加上<Int>可限制類別為數字
    var mutableList:MutableList<Int> = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)
}