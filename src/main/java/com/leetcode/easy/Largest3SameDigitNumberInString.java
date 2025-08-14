/*
 * 2264. Largest 3-Same-Digit Number in String - https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string, sized 3+, containing just digits:
 * Return the highest value triplet of the same digit in the string
 * Or "", if there is not such triplet
 */
public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {
        int found = -1;

        for(int i = 1; i < num.length() -1; i++) {
            char cur = num.charAt(i);
            if(num.charAt(i-1) == cur && cur == num.charAt(i+1)) {
                if(cur - '0' > found) {
                    found = cur - '0';
                }
            }
        }

        if (found >= 0) {
            return String.valueOf(found).repeat(3);
        } else {
            return "";
        }
    }
}
