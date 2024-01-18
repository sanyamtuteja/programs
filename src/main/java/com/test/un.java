package org.example.test;

import java.util.Arrays;
import java.util.Comparator;

public class un {

    public static void main(String[] args) {
        String sentence = "Hello123 World456 Java789 Programming123";
        String[] words = sentence.split(" ");

        Arrays.sort(words, new CustomComparator());

        // Print the sorted sentence
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Extract integers from the strings
            int num1 = extractNumber(s1);
            int num2 = extractNumber(s2);

            // Compare based on the extracted integers
            return Integer.compare(num1, num2);
        }

        private int extractNumber(String s) {
            StringBuilder number = new StringBuilder();
            boolean foundDigit = false;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    number.append(c);
                    foundDigit = true;
                } else if (foundDigit) {
                    // Break if a non-digit character is encountered after finding a digit
                    break;
                }
            }
            return foundDigit ? Integer.parseInt(number.toString()) : 0;
        }
    }
}
