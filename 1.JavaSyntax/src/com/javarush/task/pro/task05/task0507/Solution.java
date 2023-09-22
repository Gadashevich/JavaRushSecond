package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        array = new int[number];
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
            if(array[i]>max) max=array[i];
        }
        System.out.println(max);

    }
}
