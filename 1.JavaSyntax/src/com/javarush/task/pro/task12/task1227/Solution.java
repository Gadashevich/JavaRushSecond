package com.javarush.task.pro.task12.task1227;

/* 
   Ох уж эта жуткая корзина
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static List<Robot> rescuedRobots = new ArrayList();

    public static List<Robot> cableContents = new ArrayList<>(List.of(new Robot("T1000"), new Robot("Amigo"),
            new Robot("B1"), new Robot("Diego"), new Robot("Zed")));

    public static void main(String[] args) {
        rescueRobots();
        emptyGarbageBin();
        printList(rescuedRobots);

    }

    public static void rescueRobots(){
        for (int i = 0; i < cableContents.size() ; i++) {
            if (cableContents.get(i).getName().contains("Amigo") || cableContents.get(i).getName().contains("Diego") ) {
                rescuedRobots.add(cableContents.get(i));
                cableContents.remove(i);
            }

        }
    }

    private static void emptyGarbageBin() {
        cableContents.clear();
        System.out.println("Garbage cleared");
    }

    public static void printList(List<Robot> list) {
        for (Robot o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
