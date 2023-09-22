package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int[] mass = new int[number];

            for (int i = 0; i < number; i++) {
                int tmp = sc.nextInt();
                mass[i] = tmp;
            }


            if (number % 2 == 0) {
                for (int i = mass.length-1; i >=0 ; i--) {
                    System.out.println(mass[i] + " ");
                }
            } else {
                for (int i = 0; i < mass.length; i++) {
                    System.out.println(mass[i] + " ");
                }
            }


        }
    }
}
