package com.test;

import java.util.Arrays;

public class longestSubsequence {
    public static void main(String[] args) {
        String s1 = "abcaa", s2 = "aacba";
        System.out.println(longestCommonSubsequence(s1, s2, s1.length() - 1, s2.length() - 1));
        System.out.println(longestSubsequence(s1, s2));

    }

    public static int longestSubsequence(String s1, String s2) {

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s1.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

// for printing
        int i = s1.length();
        int j = s2.length();
        int index = dp[i][j];
        int temp = index;

        char[] lcs = new char[index + 1];

        while (i > 0 && j > 0) {
            // If current character in X[] and Y are same,
            // then current character is part of LCS
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                // Put current character in result
                lcs[index - 1] = s1.charAt(i - 1);

                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }
        // Print the lcs
        System.out.print("LCS of " + s1 + " and " + s2
                + " is ");
        for (int k = 0; k <= temp; k++)
            System.out.print(lcs[k]);
        return dp[s1.length()][s2.length()];
    }

    public static int longestCommonSubsequence(String s1, String s2, int len1, int len2) {
        if (len1 < 0 || len2 < 0)
            return 0;
        if (s1.charAt(len1) == s2.charAt(len2))
            return 1 + longestCommonSubsequence(s1, s2, len1 - 1, len2 - 1);
        else
            return Math.max(longestCommonSubsequence(s1, s2, len1 - 1, len2),
                    longestCommonSubsequence(s1, s2, len1, len2 - 1));
    }

}
