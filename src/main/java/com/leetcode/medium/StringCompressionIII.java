/*
 * 3163. String Compression III - https://leetcode.com/problems/string-compression-iii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Compress the input string in the format [count][char]... where count could be
 * in range [1..9]
 * <p>
 * Constraints: input string is not empty and contains only English letters
 */
public class StringCompressionIII {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();

        int count = 1;
        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char cur = word.charAt(i);

            if (count != 9 && cur == prev) {
                count += 1;
            } else {
                result.append(count);
                result.append(prev);

                count = 1;
                prev = cur;
            }
        }

        result.append(count);
        result.append(prev);

        return result.toString();
    }
}
