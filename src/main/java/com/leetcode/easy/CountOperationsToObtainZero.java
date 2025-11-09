/*
 * 2169. Count Operations to Obtain Zero
 * https://leetcode.com/problems/count-operations-to-obtain-zero/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two non-negative integers,
 * we want to reduce (at least) one of them to zero -
 * just subtracting one of them to the other one.
 * Return the minimum number of subtractions required.
 */
class CountOperationsToObtainZero {
    /**
     * Smoke Test
     */
    static void main() {
        CountOperationsToObtainZero x = new CountOperationsToObtainZero();

        System.out.println(x.countOperations(2, 3) == 3);
        System.out.println(x.countOperations(10, 10) == 1);
    }

    /**
     * Count how many step the Euclides algorithm takes
     */
    public int countOperations(int num1, int num2) {
        int result = 0;
        while (num1 != 0 && num2 != 0) {
            result += num1 / num2;
            num1 %= num2;

            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        return result;
    }
}
