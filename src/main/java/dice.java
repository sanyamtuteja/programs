package com.test;

import java.util.ArrayList;
import java.util.List;

public class dice {
    public static void main(String[] args) {
        System.out.println(dice("",4));
    }

    static List<String> dice(String p, int target) {
        List<String> list = new ArrayList<>();
        if (target == 0) {
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i<=target; i++) {
            ans.addAll(dice(p + i, target - i));
        }
        return ans;
    }
}
