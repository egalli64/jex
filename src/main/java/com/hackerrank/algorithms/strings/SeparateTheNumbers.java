/*
 * Prepare > Algorithms > Strings > Separate the Numbers
 * https://www.hackerrank.com/challenges/separate-the-numbers/
 * <p>
 * A non-empty string, max size 32, contains only chars in [0..9]
 * Check if it could be split in a sequence of 2+ integers
 * <ul>
 *     <li>increasing by 1</li>
 *     <li>no leading 0 allowed</li>
 *     <li>no rearranging chars allowed</li>
 * </ul>
 * Print "NO" or "YES x" where x is the first element of the sequence
 */
package com.hackerrank.algorithms.strings;

public class SeparateTheNumbers {
    public static void separateNumbers(String s) {
        long result = starter(s);
        System.out.println(result == -1 ? "NO" : "YES " + result);
    }

    static public long starter(String s) {
        for (int step = 1; step <= s.length() / 2; step++) {
            long first = Long.parseLong(s.substring(0, step));
            String expected = Long.toString(first + 1);

            int beg = step;
            int end;
            while ((end = beg + expected.length()) <= s.length()) {
                String cur = s.substring(beg, end);
                if (cur.equals(expected)) {
                    if (end == s.length()) {
                        return first;
                    }
                    beg = end;
                    expected = Long.toString(Long.parseLong(cur) + 1);
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
