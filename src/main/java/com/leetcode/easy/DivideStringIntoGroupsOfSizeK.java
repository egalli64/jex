/*
 * 2138. Divide a String Into Groups of Size k - https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Split the passed string in k-sized substrings. If the last one is shorter
 * than k, right-pad it with the passed fill char.
 */
public class DivideStringIntoGroupsOfSizeK {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length() / k;
        if (s.length() % k != 0) {
            size += 1;
        }

        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            int begin = i * k;
            int end = begin + k;

            if (end > s.length()) {
                result[i] = s.substring(begin) + String.valueOf(fill).repeat(end - s.length());
            } else {
                result[i] = s.substring(begin, end);
            }
        }

        return result;
    }
}
