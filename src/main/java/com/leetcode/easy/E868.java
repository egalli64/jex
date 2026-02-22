/*
 * 868. Binary Gap
 * https://leetcode.com/problems/binary-gap/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Find the longest distance between ones in the binary representation of the passed integer.
 * <p>
 * If there are less than two 1s return 0
 */
class E868 {
    /**
     * Smoke Test
     */
    void main() {
        E868 x = new E868();

        System.out.println(x.binaryGap(22) == 2);
        System.out.println(x.binaryGap(8) == 0);
        System.out.println(x.binaryGap(5) == 2);
    }

    public int binaryGap(int n) {
        int result = 0;

        int lastOne = -1;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) > 0) {
                if (lastOne >= 0) {
                    result = Math.max(result, i - lastOne);
                }
                lastOne = i;
            }
        }

        return result;
    }
}
