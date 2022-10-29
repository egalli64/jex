/**
 * Prepare > Algorithms > Strings > HackerRank in a String!
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string/
 * <p>
 * Check if a string contains the chars from "hackerrank" in the expected order, possibly with gaps
 * Return "YES" or "NO"
 */
package com.hackerrank.algorithms.strings;

public class HackerRankInAString {
    private static final String TARGET = "hackerrank";

    public static String hackerrankInString(String s) {
        int j = 0;
        for(int i = 0; i < s.length() && j < TARGET.length(); i++) {
            if(s.charAt(i) == TARGET.charAt(j)) {
                j++;
            }
        }
        return j == TARGET.length() ? "YES" : "NO";
    }
}
