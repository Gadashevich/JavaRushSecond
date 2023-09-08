package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        multiArray = new int[x][];

        for (int i = 0; i < x; i++) {
            multiArray[i] = new int[sc.nextInt()];
        }
    }
}
