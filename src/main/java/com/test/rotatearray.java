package org.example.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class rotatearray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotateBy = 4;

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] rotatedArray = rotateArray(array, rotateBy);

        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }

    private static int[] rotateArray(int[] array, int rotateBy) {
        int length = array.length;

        return IntStream.range(0, length)
                .mapToObj(i -> array[(i + rotateBy) % length])
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
