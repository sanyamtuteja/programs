package org.example.test;
//

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test00011 {
    public static void main(String[] args) {
//[4:50 PM] Prathama Sengupta
//[1,2,3,4,5]
//[4:50 PM] Prathama Sengupta
//        resultant array -
//[4:50 PM] Prathama Sengupta
//[5,1,2,3,4]
//        o/p =d

        int[] a = {1, 2, 3, 4, 5};

        leastOccuring(a,2);

        String str = "aaabbccccd";

        Map<Character, Long> charCounts = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        char leastRepeatingChar = charCounts.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No characters found"));
        System.out.println(leastRepeatingChar);

    }

    public static void leastOccuring(int[] arr, int n) {

        // Rotate the array by k elements
        arr = IntStream.range(0, arr.length)
//                .map(i -> (i + n) % arr.length)
                .toArray();

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
}
//        int[] res = new int[a.length];
//        for (int i = 0; i < a.length - n; i++) {
//            if (i < a.length - 1)
//                res[i + 1] = a[i];
//        }
//        res[0] = a[a.length-1];
//        System.out.println(Arrays.toString(res));