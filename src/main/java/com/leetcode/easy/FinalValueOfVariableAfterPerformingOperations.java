/*
 * 2011. Final Value of Variable After Performing Operations - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * The possible operations are: "++X", "X++", "--X", "X--".
 * Initially, X is 0.
 * Return the value of X after applying all the passed operations.
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.contains("+")) {
                result += 1;
            } else {
                result -= 1;
            }
        }

        return result;
    }
}
