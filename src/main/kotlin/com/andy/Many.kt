package com.andy

import java.time.LocalDateTime

fun main() {
    //用HashMap做停車場
    val parkingLot = HashMap<String,Car>()
    var enter =
        LocalDateTime.of(2018,12,25,8,0,0)
    var car:Car? = Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car = Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    //Car 1 leaving
    var leave =
        LocalDateTime.of(2018,12,25,9,0,0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration:${car?.duration()}")
    parkingLot.remove(car?.id)
    //Car 2 leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration:${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    //停車場
//    val list = listOf(5,1,2,7)
//    println(list)
//    val scroes = listOf(68,88,77,99,50)
//    for (score in scroes){
//        println(score)
//    }
//    println(list.get(3))
//    //加上<Int>可限制類別為數字
//    var mutableList:MutableList<Int> = mutableListOf(5,1,2,7)
//    mutableList.add(6)
//    println(mutableList)
}