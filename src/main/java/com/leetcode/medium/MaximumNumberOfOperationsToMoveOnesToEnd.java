/*
 * 3228. Maximum Number of Operations to Move Ones to the End
 * https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a non-empty "binary" string (contains just 0s and 1s),
 * count the max number of operations required to move the 1s to the right.
 * Each 1 is moved to the right until it reaches the end, or another 1.
 */
class MaximumNumberOfOperationsToMoveOnesToEnd {
    /**
     * Smoke Test
     */
    static void main() {
        final MaximumNumberOfOperationsToMoveOnesToEnd x = new MaximumNumberOfOperationsToMoveOnesToEnd();

        System.out.println(x.maxOperations("1001101") == 4);
        System.out.println(x.maxOperations("00111") == 0);
        System.out.println(x.maxOperations("110") == 2);
    }

    public int maxOperations(String s) {
        int result = 0;
        int counter = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                counter += 1;
            } else if (s.charAt(i + 1) == '1') {
                result += counter;
            }
        }
        if (s.charAt(s.length() - 1) == '0') {
            result += counter;
        }

        return result;
    }
}
