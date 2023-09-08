package com.javarush.task.pro.task09.task0922;

/* 
Закосить под пиратов
*/

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int check = 0;
        for (int i = 0; i < piratesDB.length && check < 2; i++) {
            if(piratesDB[i].contains("b")){
                piratesDB[i] = piratesDB[i].replaceAll("b","\b");
                check++;
            }
        }

    }

    public static void addTwoNames() {
            String[] pirates = new String[piratesDB.length+2];
        for (int i = 0; i < piratesDB.length; i++) {
            pirates[i] = piratesDB[i];
        }
        pirates[pirates.length-2] = "Рыжий Амиго";
        pirates[pirates.length-1] = "Одноглазый Диего";
        piratesDB = pirates;

    }
}
