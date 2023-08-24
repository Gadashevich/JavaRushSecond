package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String acc : accountsList) {
            System.out.println(acc);
        }
    }

    public static void convertAccounts() {
        for (String account : Accounts.getAccounts()) {
            accountsList.add(account);
        }
    }

    public static void registerAccount(String username) {
       if(!accountsList.contains(username)){
            accountsList.add(username);
        }
    }
}