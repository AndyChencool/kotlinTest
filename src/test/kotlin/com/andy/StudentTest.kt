package com.andy

import com.andy.studenKt.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{

    @Test
    fun highestTest(){
        val student = Student("andy",60 , 80)
        Assertions.assertEquals(80,student.highest())
    }

    @Test
    fun averageTest(){
        val student = Student("andy",60 , 80)
        Assertions.assertEquals((60+80)/2, student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("andy",60 , 80)
        Assertions.assertEquals("C", student.grading())
    }
}