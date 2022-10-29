/**
 * Prepare > Algorithms > Strings > Mars Exploration
 * https://www.hackerrank.com/challenges/mars-exploration/
 * <p>
 * A string, sized a multiple of 3, should contain only repetition of "SOS"
 * Return the number of non-matching char
 */
package com.hackerrank.algorithms.strings;

public class MarsExploration {
    public static int marsExploration(String s) {
        int count = 0;
        String target = "SOS";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != target.charAt(i%3)) {
                count += 1;
            }
        }

        return count;
    }
}
