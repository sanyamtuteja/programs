package org.example.test;


//Find the common prefix String arr[] ={"armstrong","armor","archer"}

import java.util.Arrays;

public class test002 {
    public static void main(String[] args) {
        String[] str = {"armstrong", "armor", "archer"};
        commonPrefix(str);

    }

    public static void commonPrefix(String[] s) {

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String s1 = s[0];
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < s.length; i++) {
            String temp = s[i];
            int len = Math.min(s1.length(), temp.length());
            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) == temp.charAt(j)) {
                    res.append(s1.charAt(j));
                }
                System.out.println(res);
            }
        }
    }
}