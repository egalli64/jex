/*
 * 1018. Binary Prefix Divisible By 5
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an int array containing just zeroes and ones,
 * consider each value from the beginning to the current position,
 * set the matching element in the resulting boolean list as true if divisible by 5.
 */
class E1018 {
    /**
     * Smoke Test
     */
    static void main() {
        E1018 x = new E1018();

        System.out.println(x.prefixesDivBy5(new int[]{0, 1, 1}) + " == [true,false,false]");
        System.out.println(x.prefixesDivBy5(new int[]{1, 1, 1}) + " == [false,false,false]");
    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>(nums.length);

        int current = 0;
        for (int num : nums) {
            current = (current * 2 + num) % 5;
            result.add(current == 0);
        }

        return result;
    }
}
