/*
 * 1957. Delete Characters to Make Fancy String - https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string, delete the minimum possible number of characters from it to
 * make it "fancy" (meaning: no three consecutive characters are equal) and then
 * return it.
 * 
 * Constraint: the input string is not empty
 */
public class DeleteCharactersToMakeFancyString {
    /**
     * After inserting the first char in the result, loop on all the other chars.
     * Keep track of the counter for the current char, increasing or resetting it as
     * required. When the counter stays under 3, push it in the result.
     * 
     * @param s the input string, it should be _not empty_
     * @return the generated fancy string
     */
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

        char prev = s.charAt(0);
        result.append(prev);
        int counter = 1;

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == prev) {
                counter += 1;
            } else {
                counter = 1;
            }
            if (counter < 3)
                result.append(cur);

            prev = cur;
        }

        return result.toString();
    }
}
