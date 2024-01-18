package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurringChar {
    public static void main(String[] args) {
        String str = "aaabbbbbbaacccccccccdddddddddddddddddddddd";

        maxOccurringCharacter(str);
        System.out.println("Hello world!");


    }

// Find the max occurring character in String

    public static void maxOccurringCharacter(String s) {
        char[] chArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : chArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        System.out.println(map.toString());

        Integer max = 0;
        Character key = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            Integer temp =  e.getValue();
            if (temp > max) {
                max =  temp;
                key = e.getKey();
            }
        }
        System.out.println(key + "   "+ max);
    }
}