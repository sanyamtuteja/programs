package com.test;

import java.util.*;

public class biggestNumberfromArray {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();

        // Output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        biggestNumber(arr);
    }

    public static void biggestNumber(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YZ = Y + X;

                return XY.compareTo(YZ) > 0 ? -1 : 1;
            }
        });

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        System.out.println(list);
    }
}
