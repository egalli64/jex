/*
 * 3075. Maximize Happiness of Selected Children
 * https://leetcode.com/problems/maximize-happiness-of-selected-children/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Pick the k highest value, and sum them up.
 * But: each time a value is picked up, the other decrease by one,
 * until they get equal to zero.
 * <p>
 * Assume k positive and not greater than array length.
 */
class M3075 {
    /**
     * Smoke Test
     */
    static void main() {
        M3075 x = new M3075();

        System.out.println(x.maximumHappinessSum(new int[]{1, 2, 3}, 2) == 4);
        System.out.println(x.maximumHappinessSum(new int[]{1, 1, 1, 1}, 2) == 1);
        System.out.println(x.maximumHappinessSum(new int[]{2, 3, 4, 5}, 1) == 5);
    }

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long result = 0;
        for (int i = 0, j = happiness.length - 1; i < k; i++, j--) {
            int cur = happiness[j] - i;
            if (cur > 0) {
                result += cur;
            }
        }
        return result;
    }
}
