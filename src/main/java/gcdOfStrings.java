package com.test;

public class gcdOfStrings {
    public static void main(String[] args) {


        System.out.println(gcdOfStrings("ABCABCABC", "ABCABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    public static int gcd(int a, int b) {
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        return (b == 0) ? a : gcd(b, a % b);
    }
}
