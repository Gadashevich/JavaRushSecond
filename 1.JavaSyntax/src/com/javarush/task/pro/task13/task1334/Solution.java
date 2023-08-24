package com.javarush.task.pro.task13.task1334;

/* 
Антипирамида
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        Rewards rewards = new Rewards();
        for (Voter voter : Voter.generateVoters()) {
                if(voter.getPersonalQuality().equalsIgnoreCase("Good")){
                    corporatePyramid.put(voter, rewards.getGoodRewardsMap());
                } else if(voter.getPersonalQuality().equalsIgnoreCase("holy")){
                    corporatePyramid.put(voter,rewards.getHolyRewardsMap());
                }
        }
    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}