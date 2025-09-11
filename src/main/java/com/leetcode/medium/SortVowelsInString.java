/*
 * 2785. Sort Vowels in a String - https://leetcode.com/problems/sort-vowels-in-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Sort (in natural order) only the vowels (any case) in the input string
 */
public class SortVowelsInString {
    public String sortVowels(String s) {
        char[] vowels = new char[s.length()];
        int size = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels[size] = c;
                size += 1;
            }
        }
        Arrays.sort(vowels, 0, size);

        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                result.append(vowels[j]);
                j += 1;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
