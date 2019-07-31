package com.andy

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter:LocalDateTime =
        LocalDateTime.of(2018,12,25,8,0,0)
    val leave:LocalDateTime =
        LocalDateTime.of(2018,12,25,10,8,0)
    var car = Car("AAA-0001",enter)
    car.leave = leave
    println(car.duration())
    //使用Math.ceil 無條件多1
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
    println(hours*30)
}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime? = null
    set(value) {
        if (enter.isBefore(value)){
            //泛指value
            field = value
        }
    }
    fun duration():Long = Duration.between(enter,leave).toMinutes()

}