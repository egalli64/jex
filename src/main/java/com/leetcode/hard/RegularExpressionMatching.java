/*
 * 10. Regular Expression Matching - https://leetcode.com/problems/regular-expression-matching/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * A regular expression matching (full string) supporting
 * <ul>
 * <li>'.' for any char
 * <li>'*' for 0+ of previous char
 * </ul>
 * Constraints:
 * <ul>
 * <li>both string are non empty with lower case English letters
 * <li>the pattern could have '.' and '*'
 * <li>'*' is prefixed by a valid char
 */
public class RegularExpressionMatching {
    /**
     * Is p matching s?
     * 
     * @param s a non-empty target string
     * @param p a non-empty pattern
     * @return true in case of full match
     */
    public boolean isMatch(String s, String p) {
        boolean[][] solutions = new boolean[s.length() + 1][p.length() + 1];
        solutions[0][0] = true;
        for (int j = 2; j < solutions[0].length; j++) {
            if (p.charAt(j - 1) == '*') {
                solutions[0][j] = solutions[0][j - 2];
            }
        }

        for (int i = 1; i < solutions.length; i++) {
            for (int j = 1; j < solutions[0].length; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    solutions[i][j] = solutions[i - 1][j - 1];
                } else if (j > 1 && p.charAt(j - 1) == '*') {
                    solutions[i][j] = solutions[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        solutions[i][j] = solutions[i][j] | solutions[i - 1][j];
                    }
                }
            }
        }

        return solutions[s.length()][p.length()];
    }
}
