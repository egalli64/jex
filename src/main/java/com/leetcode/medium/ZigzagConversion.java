/*
 * 6. Zigzag Conversion - https://leetcode.com/problems/zigzag-conversion/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * PAYPALISHIRING by 3 becomes PAHNAPLSIIGYIR
 * 
 * <pre>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * </pre>
 * 
 * by 4 becomes PINALSIGYAHRPI
 * 
 * <pre>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * </pre>
 */
public class ZigzagConversion {
    /**
     * A silly string conversion
     * 
     * @param s       a string sized [1 .. 1_000]
     * @param numRows key of conversion [1 .. 1_000]
     * @return the converted string
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        final int step = 2 * numRows - 2;

        externalLine(s, result, 0, step);

        for (int i = 1; i < numRows - 1; i++) {
            for (int j = i; j < s.length(); j += step) {
                result.append(s.charAt(j));
                int k = j + step - 2 * i;
                if (k < s.length()) {
                    result.append(s.charAt(k));
                }
            }
        }

        externalLine(s, result, numRows - 1, step);

        return result.toString();
    }

    private void externalLine(String s, StringBuilder sb, int pos, int step) {
        for (int i = pos; i < s.length(); i += step) {
            sb.append(s.charAt(i));
        }
    }
}
