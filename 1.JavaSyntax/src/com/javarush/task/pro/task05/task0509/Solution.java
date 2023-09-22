package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {

                MULTIPLICATION_TABLE[i-1][j-1] = j*i;
                System.out.print( MULTIPLICATION_TABLE[i-1][j-1]+" " );
            }

            System.out.println();

        }

    }
}
