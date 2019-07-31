package com.andy.guess;

import java.util.*;

public class GameFor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 5 ; i >= 1 ; i--){
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println(sum);
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=4 ; i++) {
            System.out.println("Please enter a unmber:("+i+"/4)");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次:"+number);
            if (number > secret ) {
                System.out.println("lower");
            }else if (number < secret) {
                System.out.println("higher");
            }else{
                System.out.println("Great, the number is:" + number);
                break; //中斷for迴圈
//                return;  //全部fun中斷
            }
        }
        System.out.println("結束");
    }
}
