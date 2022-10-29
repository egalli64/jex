/*
 * Prepare > Algorithms > Strings > Pangrams
 * https://www.hackerrank.com/challenges/pangrams/
 * <p>
 * A non-empty string should contain all chars in [a-z], case insensitive
 * Return "pangram" or "not pangram"
 */
package com.hackerrank.algorithms.strings;

import java.util.Arrays;

public class Pangrams {
    public static String pangrams(String s) {
        s = s.toLowerCase();

        int[] alpha = new int[26];
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            if (i >= 0 && i < 26) {
                alpha[i] += 1;
            }
        }

        if (Arrays.stream(alpha).filter(x -> x == 0).count() == 0) {
            return "pangram";
        }
        return "not pangram";
    }
}
