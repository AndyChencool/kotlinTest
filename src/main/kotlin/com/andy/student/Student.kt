package com.andy.studenKt

import java.util.*

fun main() {
//    userInput()
    var stu = Student(name = "andy" , english = 60, math = 80)
    stu.print()
    val test = 123
    println("Test is:$test")
    println("High score: ${stu.highest()}")

}

class Student(var name:String?, var english:Int, var math:Int) {
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}")
        println("\t" + grading())
//        if (getAverage() >= 60) {
//            print("\tPASS")
//        }else{
//            print("\tFAILED")
//        }
    }
    fun passOrFailed() = if(getAverage() >= 60) "PASS" else "FAILED"
    //    fun grading(): Char{
    //在kotlin switch 被 when取代
//        var grading:Char = when(getAverage()){
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//        }
//        return when(getAverage()) {
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//        }

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    //    fun getAverage():Int{
//        return (english + math) / 2
//    }
    fun getAverage() = (english + math) / 2

    fun highest() : Int {
        var max =  if (english > math) {
            println("")
            english
        } else {
            math
        }
//        var max = if (english > math) english else math
//        if (english > math) {
//            max = english
//        }else{
//            max = math
//        }

        return max
    }

    fun nameCheck() {
        println(name?.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name = name, english = english, math = math)
    stu.print()
    stu.nameCheck()
}