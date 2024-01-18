package com.test;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {

    }


    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addParenthesis(list, "", 0, 0, n);
        return list;

    }

    private static void addParenthesis(List<String> list, String s, int left, int right, int n) {
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }

        if (left < n) {
            addParenthesis(list, s + '(', left + 1, right, n);
        }
        if (right < left) {
            addParenthesis(list, s + ')', left, right + 1, n);
        }

    }

}
