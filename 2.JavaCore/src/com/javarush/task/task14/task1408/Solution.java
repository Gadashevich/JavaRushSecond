package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equalsIgnoreCase(Country.RUSSIA)) {
                hen = new RussianHen();
            } else if (country.equalsIgnoreCase(Country.UKRAINE)) {
                hen = new UkrainianHen();
            } else if (country.equalsIgnoreCase(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            } else if (country.equalsIgnoreCase(Country.BELARUS)) {
                hen = new BelarusianHen();
            }

            return hen;
        }
    }


}
