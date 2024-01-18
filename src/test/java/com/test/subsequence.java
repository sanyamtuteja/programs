package com.test;

import org.checkerframework.checker.units.qual.A;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
//        subseq("", "abc");
//        System.out.println(subseqArr("", "abc"));
        int[] arr = {1, 2, 2};

        System.out.println(subsetDup(arr));
    }


    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqArr(String p, String up) {
        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArr(p + ch, up.substring(1));
        ArrayList<String> right = subseqArr(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int num = 0; num < arr.length; num++) {
            start = 0;
            if (num > 0 && arr[num] == arr[num - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[num]);
                outer.add(internal);
            }
        }

        return outer;
    }

}

