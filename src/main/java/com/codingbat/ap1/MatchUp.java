/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.stream.IntStream;

/**
 * matchUp - https://codingbat.com/prob/p139677
 * <p>
 * Count how many strings in the same position in the two passed arrays are
 * non-empty and starts with the same char.
 */
public class MatchUp {
    /**
     * For loop on both arrays - assumed same size. Increase the counter when a
     * match is found.
     *
     * @param a a string array
     * @param b another string array, same size
     * @return the counter
     */
    public static int solution(String[] a, String[] b) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                counter += 1;
            }
        }

        return counter;
    }

    /**
     * On an int stream representing all the indices for the two arrays (assume same
     * size), filter to keep only the "good" elements, then count them.
     * 
     * @param a a string array
     * @param b another string array, same size
     * @return the counter
     */
    public static int modern(String[] a, String[] b) {
        return (int) IntStream.range(0, a.length) //
                .filter(i -> !a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) //
                .count();
    }
}
