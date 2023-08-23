package com.javarush.task.pro.task11.task1130;

/* 
Робозомби космопорта
*/

public class Solution {

    public static final String[] lyrics = {"Du...", "Du hast...", "Du hast ultra metal"};

    public static void main(String[] args) {
      //  Solution solution = new Solution();

        UltraMetal ultraMetal = new UltraMetal();
        ultraMetal.playUltraMetal(lyrics[0], lyrics[1], lyrics[2]);
    }
}