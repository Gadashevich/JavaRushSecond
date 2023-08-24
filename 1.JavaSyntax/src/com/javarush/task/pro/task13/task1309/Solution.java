package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;
import java.util.Map;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("John",4.5);
        grades.put("Vasya",4.2);
        grades.put("Dmitriy",4.1);
        grades.put("Boris",5.0);
        grades.put("Alan",3.9);
    }
}
