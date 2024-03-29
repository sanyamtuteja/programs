package com.test;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        perm("", "abc");
    }

    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permArr(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permArr(f + ch + s, up.substring(1)));
        }
        return ans;
    }

}
