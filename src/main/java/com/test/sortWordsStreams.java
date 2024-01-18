package org.example.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortWordsStreams {

    public static void main(String[] args) {
        String sentence = "Hello123 World456 Java789 Streams1234 Example5678";

        List<String> sortedSentence = sortSentence(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Sorted Sentence: " + String.join(" ", sortedSentence));
    }

    public static List<String> sortSentence(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s+"));

        List<String> sortedWords = words.stream()
                .sorted((s1, s2) -> extractNumber(s1) - extractNumber(s2))
                .collect(Collectors.toList());
        List<String> sortWords = words.stream()
                .sorted((s1,s2)->extractNumber(s1)-extractNumber(s2))
                .collect(Collectors.toList());

        return sortedWords;
    }

    private static int extractNumber(String s) {
        String number = s.replaceAll("[^0-9]", "");
        return number.isEmpty() ? 0 : Integer.parseInt(number);
    }
}
