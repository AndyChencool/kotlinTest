package com.andy;

public class Person {
    //屬性
    String name;
    int age;
    float weight;
    float height;

    //在方法裡面建構的變數稱為區域變數跟上面不同
    public Person(float weight,float height) { //簡單的建構子 不能加void
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height){
        this(weight,height);
        this.name = name;
//        this.weight = weight;
//        this.height = height;
    }

    public float bmi() {
        float bmi = weight / (height*height);
        return bmi;
    }


    public void hello() {
//        System.out.println("Hello world");
//        int age = 19;
//        Integer age2 = 19; //代表放在物件當中
//        char c = '我';
//        Character c2 = 'A';
//        byte b = 120;
//        Byte b2 = 120;
//        float weight = 66.5f;
//        double height = 1.7;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "andy";

    }
}
