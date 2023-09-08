package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
            Arrays.sort(ints);
          return Math.min(ints[0], ints[1]);

    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int[] tmp = new int[10];
        for (int i = 0; i <10 ; i++) {
            tmp[i] = sc.nextInt();
        }
        return tmp;
    }
}
