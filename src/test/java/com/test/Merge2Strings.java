package com.test;

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
//        starting with word1. If a string is longer than the other, append the additional letters onto the
//        end of the merged string.
//        Return the merged string.
//Example 1:
//
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r
public class Merge2Strings {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc",  "pqr"));
    }

//    public static String mergeAlternately(String word1, String word2) {
//        StringBuilder result = new StringBuilder();
//        int i = 0;
//        while (i < word1.length() || i < word2.length()) {
//            if (i < word1.length()) {
//                result.append(word1.charAt(i));
//            }
//            if (i < word2.length()) {
//                result.append(word2.charAt(i));
//            }
//            i++;
//        }
//        return result.toString();
//    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i=0;
        while(i<n && i<m){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        sb.append(word1.substring(i, n)).append(word2.substring(i, m));
        return sb.toString();
    }
}
