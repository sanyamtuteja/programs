package com.test;

public class compress {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        compress(chars);
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j = 0;
        if (n == 1) {
            return 1;
        }
        while (i < n) {
            int count = 1;
            char ch = chars[i];
            while (i + 1 < n && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[j++] = ch;
            } else {
                if (count > 1) {
                    chars[j++] = ch;
                    String counterstring = count + "";
                    for (int r = 0; r < counterstring.length(); r++) {
                        chars[j++] = counterstring.charAt(r);
                    }
                }
            }
            i++;
        }
        return j;
    }
}

