/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.Arrays;

/**
 * wordsFront - https://codingbat.com/prob/p183837
 * <p>
 * Given an array of strings, count its elements having the passed length
 */
public class WordsFront {
    /**
     * Create an array of strings sized n, copy the references to the first n
     * elements of the original array in the resulting array.
     * 
     * @param words an array
     * @param n     size of the new array
     * @return the "front" array
     */
    public static String[] solution(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }

        return result;
    }

    /**
     * Delegate to {@linkplain Arrays#copyOf(Object[], int)}
     *
     * @param words an array
     * @param n     size of the new array
     * @return the "front" array
     */
    public static String[] delegator(String[] words, int n) {
        return Arrays.copyOf(words, n);
    }

    /**
     * Stream the input array, keep just the first n elements, collect them to a new
     * array of strings
     * 
     * @param words an array
     * @param n     size of the new array
     * @return the "front" array
     */
    public static String[] modern(String[] words, int n) {
        return Arrays.stream(words).limit(n).toArray(String[]::new);
    }
}
