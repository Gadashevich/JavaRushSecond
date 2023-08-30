package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() > o2.getAge() ? -1 : o1.getAge() == o2.getAge() ? 0 : 1;


    }
}
