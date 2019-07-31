package com.andy.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTesit();
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = (int)list.get(0);
        int n2 = (int)list.get(3);
        System.out.println(list.size());
        List<Integer> scores =
                Arrays.asList(68,88,77,99,50);
        for (int score:scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[0] = 3;
//        numbers[5] = 7;
        int[] scores = {68,88,77,99,50};
        System.out.println(scores);
        for (int i=0;i<5;i++){
            System.out.println(scores[i]);
        }
        for (int n :scores){
            System.out.println(n);
        }
    }
}
