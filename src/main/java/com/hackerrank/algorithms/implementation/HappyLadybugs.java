/*
 * Prepare > Algorithms > Implementation > Happy Ladybugs
 * https://www.hackerrank.com/challenges/happy-ladybugs/
 * <p>
 * A non-empty string contains [A-Z] and _
 * Return YES if it is possible to arrange alphas in groups 2+ / NO otherwise
 */
package com.hackerrank.algorithms.implementation;

public class HappyLadybugs {
    public static String happyLadybugs(String b) {
        int[] counters = new int[26];
        boolean hasRoom = false;
        for (char c : b.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                counters[c - 'A']++;
            } else {
                hasRoom = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (counters[i] == 1) {
                return "NO";
            }
        }

        if (!hasRoom && b.length() > 1) {
            for (int i = 0; i < b.length() - 1; i++) {
                char cur = b.charAt(i);
                if (cur != b.charAt(i + 1)) {
                    return "NO";
                }
                while (i < b.length() - 1 && b.charAt(i + 1) == cur) {
                    i += 1;
                }
            }
            if (b.charAt(b.length() - 1) != b.charAt(b.length() - 2)) {
                return "NO";
            }
        }

        return "YES";
    }
}
