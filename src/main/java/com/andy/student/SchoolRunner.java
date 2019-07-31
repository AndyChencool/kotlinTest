package com.andy.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("andy",77,99);
        stu.print();
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
