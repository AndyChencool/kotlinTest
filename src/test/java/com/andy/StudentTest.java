package com.andy;

import com.andy.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestScoreTest(){
        Student student = new Student("andy",60,80);
        Assertions.assertEquals(80,student.highest());
    }

    @Test
    public void averageTest(){
        Student student = new Student("andy",60,80);
        Assertions.assertEquals(60+80/2, student.getAverage());
    }

}
