package com.test;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            System.out.println(sum);
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n-1];
    }

}
