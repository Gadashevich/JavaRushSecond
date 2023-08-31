package com.javarush.task.pro.task18.task1819;

import java.util.*;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.forEach(e -> System.out.println(Optional.ofNullable(e).orElse(text)));
    }
}
