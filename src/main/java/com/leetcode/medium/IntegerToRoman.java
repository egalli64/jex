/*
 * 12. Integer to Roman - https://leetcode.com/problems/integer-to-roman/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * <pre>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * </pre>
 * 
 * Special rules:
 * <ul>
 * <li>I placed before V makes 4 and before X makes 9
 * <li>X placed before L makes 40 and before C makes 90
 * <li>C placed before D makes 400 and before M makes 900
 */
public class IntegerToRoman {
    /**
     * Roman number generator
     * 
     * @param num an integer in 1 ... 3999
     * @return the Roman representation of the passed integer in I ... MMMCMXCIX
     */
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        while (num >= 1_000) {
            result.append('M');
            num -= 1_000;
        }

        if (num >= 900) {
            result.append("CM");
            num -= 900;
        }

        if (num >= 500) {
            result.append('D');
            num -= 500;
        }

        if (num >= 400) {
            result.append("CD");
            num -= 400;
        }

        while (num >= 100) {
            result.append('C');
            num -= 100;
        }

        if (num >= 90) {
            result.append("XC");
            num -= 90;
        }

        if (num >= 50) {
            result.append('L');
            num -= 50;
        }

        if (num >= 40) {
            result.append("XL");
            num -= 40;
        }

        while (num >= 10) {
            result.append('X');
            num -= 10;
        }

        if (num >= 9) {
            result.append("IX");
            num -= 9;
        }

        if (num >= 5) {
            result.append('V');
            num -= 5;
        }

        if (num == 4) {
            result.append("IV");
            num -= 4;
        }

        while (num > 0) {
            result.append('I');
            num -= 1;
        }

        return result.toString();
    }
}
