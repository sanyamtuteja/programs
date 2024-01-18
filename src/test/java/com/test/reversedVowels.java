package com.test;

//Given a string s, reverse only all the vowels in the string and return it.
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//        Example 1:
//        Input: s = "hello"
//        Output: "holle"

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class reversedVowels {
    public static void main(String[] args) {

    }


    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] list = s.toCharArray();
        StringBuilder result = new StringBuilder();

//        int i=0;
//        int j= s.length()-1;

        for (int i = 0, j = list.length - 1; i < j; ) {
            if (!vowels.contains(list[i] + "")) {
                i++;
                continue;
            }
            if (!vowels.contains(list[j] + "")) {
                j--;
                continue;
            }
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
}
