package com.test;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("smadamsam"));
    }


    public static String longestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String LCS = "";

        for (int i = 1; i < str.length(); i++) {
            int l = i;
            int h = i;
            while (str.charAt(l) == str.charAt(h)) {
                l--;
                h++;

                if (l == -1 || h == str.length())
                    break;
            }

            String palindrome = str.substring(l + 1, h);
            if (palindrome.length() > LCS.length()) {
                LCS = palindrome;
            }


            l = i - 1;
            h = i;
            while (str.charAt(l) == str.charAt(h)) {
                l--;
                h++;

                if (l == -1 || h == str.length())
                    break;
            }

            palindrome = str.substring(l + 1, h);
            if (palindrome.length() > LCS.length()) {
                LCS = palindrome;
            }
        }
        return LCS;

    }


}
