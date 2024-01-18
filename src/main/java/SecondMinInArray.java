package org.example;

import java.util.Arrays;

public class SecondMinInArray {

    public static void main(String[] args) {
        int[] arr = {22, -4, -7, -3, 3, 9, 7, 5};

        System.out.println(secondMin(arr));

    }

    public static int  secondMin(int[] arr) {

         return Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .orElseThrow(()->new RuntimeException());
    }
}
