/*
 * 1408. String Matching in an Array - https://leetcode.com/problems/string-matching-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string array, return all strings in it that is a substring of another
 * element (in no specific order)
 */
public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
