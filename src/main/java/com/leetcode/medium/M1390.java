/*
 * 1390. Four Divisors
 * https://leetcode.com/problems/four-divisors/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a non-empty int array,
 * return the sum of divisors of its elements that have exactly four divisors.
 * Or zero.
 */
class M1390 {
    /**
     * Smoke Test
     */
    static void main() {
        M1390 x = new M1390();

        System.out.println(x.sumFourDivisors(new int[]{21, 4, 7}) == 32);
        System.out.println(x.sumFourDivisors(new int[]{21, 21}) == 64);
        System.out.println(x.sumFourDivisors(new int[]{1, 2, 3, 4, 5}) == 0);
    }

    public int sumFourDivisors(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result += divisorSum(num);
        }

        return result;
    }

    private int divisorSum(int num) {
        if (num < 6) {
            return 0;
        }

        int result = num + 1;
        int count = 2;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                result += i;
                count += 1;
                int other = num / i;
                if (other != i) {
                    result += other;
                    count += 1;
                }
            }
            if (count > 4) {
                return 0;
            }
        }

        return count == 4 ? result : 0;
    }
}
