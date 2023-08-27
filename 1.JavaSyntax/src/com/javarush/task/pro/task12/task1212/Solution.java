package com.javarush.task.pro.task12.task1212;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
            System.out.println(Arrays.toString(arrayList.elements));
    }
}
