package com.javarush.task.pro.task09.task0924;

/* 
Взлом Стального Стива
*/

import java.util.Arrays;
import java.util.Locale;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (int i = 0; i < morals.length ; i++) {
            for (int j = 0; j < morals[i].length ; j++) {
                    if (morals[i][j].toLowerCase().contains("killer")){
                        morals[i][j] =  morals[i][j].replace(morals[i][j],"compassion");
                    } else if (morals[i][j].toLowerCase().contains("thief")){
                        morals[i][j] =  morals[i][j].replace(morals[i][j],"fairness");
                    }else if (morals[i][j].toLowerCase().contains("bully")){
                        morals[i][j] =  morals[i][j].replace(morals[i][j],"respect");

                    }
            }
        }
    }
}