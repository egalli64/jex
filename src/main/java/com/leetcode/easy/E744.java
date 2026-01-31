/*
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array of letters (sized 2+),
 * sorted in non-decreasing order,
 * find the first char greater than the passed target.
 * Or the first char in the array.
 */
class E744 {
    /**
     * Smoke Test
     */
    static void main() {
        E744 x = new E744();

        System.out.println(x.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a') == 'c');
        System.out.println(x.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c') == 'f');
        System.out.println(x.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g') == 'j');
        System.out.println(x.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z') == 'x');
    }

    /**
     * Just do it
     */
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }

        char last = letters[letters.length - 1];
        return last > target ? last : letters[0];
    }
}
