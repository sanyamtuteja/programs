package com.test;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for (String s : strs) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == strs.length) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                str.append(entry.getKey());
            }
        }
        return str.toString();
    }
}
