/*
 * 2273. Find Resultant Array After Removing Anagrams - https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Discard from the input array the adjacent anagrams
 * <p>
 * The input array is non-empty
 */
public class FindResultantArrayAfterRemovingAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

        String current = words[0];
        result.add(current);

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(current, words[i])) {
                current = words[i];
                result.add(current);
            }
        }

        return result;
    }

    private boolean isAnagram(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        char[] a = left.toCharArray();
        Arrays.sort(a);

        char[] b = right.toCharArray();
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
