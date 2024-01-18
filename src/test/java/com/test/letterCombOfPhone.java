package com.test;

import java.util.ArrayList;
import java.util.List;

public class letterCombOfPhone {
    public static void main(String[] args) {
combination("","89");
    }

    static List<String> combination(String p, String up) {
        List<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combination(p+ch,up.substring(1)));
        }
        return ans;
    }
}
