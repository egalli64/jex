/*
 * 2125. Number of Laser Beams in a Bank - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Each string passed in contains just 0s and 1s, representing a security device.
 * If a string is empty (contains just zeroes) skip it.
 * A laser beam connects each device to all the other devices on the next non-empty rows.
 * Count how many laser beams are present.
 */
public class NumberOfLaserBeamsInBank {
    public int numberOfBeams(String[] bank) {
        int result = 0;

        int previous = 0;
        for (String s : bank) {
            int current = 0;
            for (char c : s.toCharArray()) {
                current += (c - '0');
            }

            if (current > 0) {
                result += previous * current;
                previous = current;
            }
        }

        return result;
    }

    public int fun(String[] bank) {
        int result = 0;

        int previous = 0;
        for (String s : bank) {
            int current = (int) s.chars().filter(x -> x == '1').count();
            if (current > 0) {
                result += previous * current;
                previous = current;
            }
        }

        return result;
    }
}
