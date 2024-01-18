package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class kidsWithCandies {
    //    There are n kids with candies. You are given an integer array candies,
//    where each candies[i] represents the number of candies the ith kid has,
//    and an integer extraCandies, denoting the number of extra candies that you have.
//
//    Return a boolean array result of length n, where result[i] is true if,
//    after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids,
//    or false otherwise.
//
//    Note that multiple kids can have the greatest number of candies.
//            Example 1:
//
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : candies) {
            if (i + extraCandies >= max) {
                result.add(true);
            } else result.add(false);

        }
        return result;
    }
}
