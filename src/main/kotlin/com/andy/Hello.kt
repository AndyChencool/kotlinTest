package com.andy

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    //加上？後可以放null值 !!出現null的話例外處理
    var s:String? = "abcde"
    //字串長度值
    println(s?.length)
    //取第幾個字串
    println(s?.get(3))
    //取幾個字串之後
    println(s?.substring(3))

    val h = Human(weight = 66.5f, height = 1.7f); //不能再改變的變數
    println(h.bmi());
    val score = 88;
    val c:Char = 'A'
    println(score > 90)
    println(c.toInt() > 60)

//    h.hello()
//    var age2 = 19; //變數
//    age2 = age2.plus(other = 1); //增加 1
//    val age = 19;  //不可改變的值
//    var weight = 66.5;
//    var name: String;
//    name = "Andy"
//    print(age2)
}

class Human(var name:String= "", var weight:Float, var height:Float) {
    init {
        println("test $weight")
    }
//    constructor(name:String,weight: Float,height: Float) :this(weight, height)

    fun bmi() :Float {
        var bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello kotlin")
    }
}