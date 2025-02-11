package day07.genericEx.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("functional", "programming", "with", "generics", "in", "Java");

        List<String> filterWords = words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(filterWords);
    }
}
