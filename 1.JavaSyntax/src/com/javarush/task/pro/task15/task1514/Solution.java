package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path of1 = Path.of(str1);
        Path of2 = Path.of(str2);
        try{
        System.out.println(of1.relativize(of2));

        }catch (Exception e){

        }
    }
}

