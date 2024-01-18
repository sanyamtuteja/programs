package com.test;
//
//Input: s = "the sky is blue"
//        Output: "blue is sky the"


import java.util.Arrays;

public class reverseWords {

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] s1 = s.trim().split("\\s+");
        System.out.println(Arrays.toString(s1));
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.println(s1[i]);
//            if (!s1[i].equals("")) {
                result.append(s1[i]).append(" ");
//            }
        }

        return result.toString().trim();
    }
}
