package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;

       while (true) {
            String line = reader.readLine();

            if (line.equalsIgnoreCase("user")) {
                person = new Person.User();
                doWork(person);
            } else if (line.equalsIgnoreCase("loser")) {
                person = new Person.Loser();
                doWork(person);
            } else if (line.equalsIgnoreCase("coder")) {
                person = new Person.Coder();
                doWork(person);
            } else if (line.equalsIgnoreCase("proger")) {
                person = new Person.Proger();
                doWork(person);
            } else {
                break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
