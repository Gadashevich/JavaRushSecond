package com.javarush.task.task20.task2017;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A name;
        try {
            name = (A) objectStream.readObject();
            System.out.println(name.toString());
        } catch (Exception e) {
            return null;
        }
        return name;

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
