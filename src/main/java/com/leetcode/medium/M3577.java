/*
 * 3577. Count the Number of Computer Unlocking Permutations
 * https://leetcode.com/problems/count-the-number-of-computer-unlocking-permutations/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Difficult to explain, easy to solve
 */
class M3577 {
    private static final int MODULO = 1_000_000_007;

    /**
     * Smoke Test
     */
    static void main() {
        M3577 x = new M3577();

        System.out.println(x.countPermutations(new int[]{1, 2, 3}) == 2);
        System.out.println(x.countPermutations(new int[]{3, 3, 3, 4, 4, 4}) == 0);
        System.out.println(x.countPermutations(new int[]{38, 223, 100, 123, 406, 234, 256, 93, 222, 259, 233, 69, 139, 245, 45, 98, 214}) == 789741546);
    }

    public int countPermutations(int[] complexity) {
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= complexity[0]) {
                return 0;
            }
        }

        long result = 1;
        for (int i = 2; i < complexity.length; i++) {
            result = result * i % MODULO;
        }
        return (int) result;
    }
}
