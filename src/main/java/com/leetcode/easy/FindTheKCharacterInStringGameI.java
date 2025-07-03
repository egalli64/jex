/*
 * 3304. Find the K-th Character in String Game I - https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Generate a string from "a" appending a copy of the original string where each char is incremented 'modulo' z.
 * So: a -> ab -> abbc -> abbcbccd ...
 * <p>
 * Return the k-th element of the sequence
 */
public class FindTheKCharacterInStringGameI {
    static private final StringBuilder seq = new StringBuilder("abbcbccd");

    public char kthCharacter(int k) {
        while (k > seq.length()) {
            final int len = seq.length();
            for (int i = 0; i < len; i++) {
                seq.append((char) (seq.charAt(i) + 1));
            }
        }
        return seq.charAt(k - 1);
    }
}
