package com.andy.student;

import com.andy.studenKt.StudentKt;

import java.util.Scanner;

public class SchoolRunner {
    //static 獨立物件
    public static void main(String[] args) {
//        userInput();
        //引用kotlin的pass值
//        com.andy.studenKt.Student.setPass(30);
        //沒加上@JvmStatic
//        com.andy.studenKt.Student.Companion.setPass(40);

        Student.pass = 50;
        Student stu = new Student("andy",77,99);
        Student stu2 = new Student("Tom", 60,40);
        Student stu3 = new Student("Jane", 30,55);
        GraduateStudent gstu =
                new GraduateStudent("jack",60,60,60);
        stu.print();
        stu2.print();
        stu3.print();
        gstu.print();
        System.out.println("max:"+ stu.highest());
    }

    private static void userInput() {
        System.out.println("Please enter student's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("max:" + stu.highest());
    }

}
