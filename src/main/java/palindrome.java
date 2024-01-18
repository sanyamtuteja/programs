package com.test;

public class palindrome {
    public boolean isPalindrome(int x) {
        int t = 0;
        int reverse = 0;
        int temp = x;

        while (x > 0) {
            t = x % 10;
            reverse = (reverse * 10) + t;
            x = x / 10;
        }

        if (temp == reverse) {
            System.out.println("palindrome works");
            return true;
        }
        return false;
    }
}
