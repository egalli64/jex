/*
 * 2678. Number of Senior Citizens - https://leetcode.com/problems/number-of-senior-citizens/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array of strings, where each element contains information in this
 * format:
 * <ol>
 * <li>10 chars: phone number</li>
 * <li>1 char: gender</li>
 * <li>2 chars: age in the interval "00" .. "99"</li>
 * <li>2 chars: seat</li>
 * </ol>
 * Return the number of passengers who are strictly more than 60 years old
 * <p>
 * Constraints: each string should have length 15 and be correctly formatted
 */
public class NumberOfSeniorCitizens {
    private static final int AGE_POS = 11;

    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            int ten = detail.charAt(AGE_POS);
            if (ten > '6' || (ten == '6' && detail.charAt(AGE_POS + 1) > '0')) {
                count += 1;
            }
        }

        return count;
    }
}
