package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
//        String[] split = path.split("/");
//        for (int i = 0; i < split.length; i++) {
//            if (split[i].contains("jdk")) {
//                split[i] = jdk;
//            }
//        }
//        return String.join("/", split);

        // return path.replaceFirst("jdk.*?/", jdk+"/");

        int one = path.indexOf("jdk");
        int two = path.indexOf("/", one);
        String oldJdk = path.substring(one, two);

        return path.replaceAll(oldJdk, jdk);
    }
}