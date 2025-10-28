/*
 * 3354. Make Array Elements Equal to Zero - https://leetcode.com/problems/make-array-elements-equal-to-zero/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.IntStream;

/**
 * Ew!
 */
public class MakeArrayElementsEqualZero {
    public int countValidSelections(int[] nums) {
        int result = 0;
        int total = IntStream.of(nums).sum();

        int partial = 0;
        for (int num : nums) {
            partial += num;
            total -= num;
            if (num == 0) {
                if (partial == total) {
                    result += 2;
                }
                if (Math.abs(partial - total) == 1) {
                    result += 1;
                }
            }
        }

        return result;
    }
}

class SmokeTest {
    static void main() {
        MakeArrayElementsEqualZero problem = new MakeArrayElementsEqualZero();

        System.out.println(problem.countValidSelections(new int[]{1, 0, 2, 0, 3}) == 2);
        System.out.println(problem.countValidSelections(new int[]{2, 3, 4, 0, 4, 1, 0}) == 0);
    }
}
