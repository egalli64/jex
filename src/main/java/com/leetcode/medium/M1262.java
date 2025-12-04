/*
 * 1262. Greatest Sum Divisible by Three
 * https://leetcode.com/problems/greatest-sum-divisible-by-three/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.IntStream;

/**
 * Given a non-empty non-negative int array,
 * return the max possible sum divisible by three
 */
class M1262 {
    /**
     * Smoke Test
     */
    static void main() {
        M1262 x = new M1262();

        System.out.println(x.maxSumDivThree(new int[]{2, 6, 2, 2, 7}) == 15);
        System.out.println(x.maxSumDivThree(new int[]{3, 6, 5, 1, 8}) == 18);
        System.out.println(x.maxSumDivThree(new int[]{4}) == 0);
        System.out.println(x.maxSumDivThree(new int[]{1, 2, 3, 4, 4}) == 12);
    }

    public int maxSumDivThree(int[] nums) {
        int result = IntStream.of(nums).sum();
        if (result % 3 == 0) {
            return result;
        }

        var ones = IntStream.of(nums).filter(x -> x % 3 == 1).sorted().limit(2).toArray();
        var twos = IntStream.of(nums).filter(x -> x % 3 == 2).sorted().limit(2).toArray();

        int one;
        int two;
        if (result % 3 == 1) {
            one = ones.length > 0 ? ones[0] : 0;
            two = twos.length == 2 ? twos[0] + twos[1] : 0;
        } else {
            one = ones.length == 2 ? ones[0] + ones[1] : 0;
            two = twos.length > 0 ? twos[0] : 0;

        }

        if (one != 0 && two != 0) {
            return result - Math.min(one, two);
        } else if (one != 0 || two != 0) {
            return result - Math.max(one, two);
        } else {
            return 0;
        }
    }
}
