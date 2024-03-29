/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.Arrays;

/**
 * wordsCount - https://codingbat.com/prob/p124620
 * <p>
 * Given an array of strings, count its elements having the passed length
 */
public class WordsCount {
    /**
     * Loop on the array, check the current element length
     *
     * @param words an array
     * @param len   a string length
     * @return the counter
     */
    public static int solution(String[] words, int len) {
        int counter = 0;
        for (String word : words) {
            if (word.length() == len) {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * Stream the array, filter to keep only the required strings, count them.
     * 
     * @param words an array
     * @param len   a string length
     * @return the counter
     */
    public static int modern(String[] words, int len) {
        return (int) Arrays.stream(words).filter(s -> s.length() == len).count();
    }
}
