/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * wordsWithoutList - https://codingbat.com/prob/p183407
 * <p>
 * Given an array of strings, return a List without the strings having the
 * passed length.
 */
public class WordsWithoutList {
    /**
     * Create an array list, loop on the input array, add to the list only the
     * required string
     *
     * @param words an array
     * @param len   the forbidden length
     * @return the required list
     */
    public static List<String> solution(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }

    /**
     * Java 8 Stream
     * 
     * @param words an array
     * @param len   the forbidden length
     * @return the required list
     */
    public static List<String> streaming(String[] words, int len) {
        return Arrays.stream(words).filter(w -> w.length() != len).collect(Collectors.toList());
    }

    /**
     * Using Stream::toList(), a Java 16 feature
     * 
     * @param words an array
     * @param len   the forbidden length
     * @return the required list
     */
    public static List<String> modern(String[] words, int len) {
        return Arrays.stream(words).filter(w -> w.length() != len).toList();
    }
}
