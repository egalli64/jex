/*
 * 1925. Count Square Sum Triples
 * https://leetcode.com/problems/count-square-sum-triples/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Count the triplets in [1...n] where a^2 + b^2 = c^2
 */
class E1925 {
    /**
     * Smoke Test
     */
    static void main() {
        E1925 x = new E1925();

        System.out.println(x.countTriples(5) == 2);
        System.out.println(x.countTriples(10) == 4);
    }

    public int countTriples(int n) {
        int result = 0;

        for (int first = 1; first < n - 1; first++) {
            for (int second = first + 1; second < n; second++) {
                int target = (int) Math.sqrt(first * first + second * second);
                if (target <= n && target * target == first * first + second * second) {
                    result += 2;
                }
            }
        }

        return result;
    }
}
