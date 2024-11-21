/*
 * 1652. Defuse the Bomb - https://leetcode.com/problems/defuse-the-bomb/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array, convert each element with the sum of the next k (wrapping
 * around) elements. If k is negative, use the previous elements.
 * <p>
 * Constraints:
 * <li>The array is not empty
 * <li>All elements are positive
 * <li>The absolute value of k is less than the array length
 */
public class DefuseTheBomb {
    /**
     * Naive solution: for each element in the array loop on the next/prev k
     * elements
     * 
     * @param code
     * @param k
     * @return
     */
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int change = Integer.signum(k);
        k = Math.abs(k);

        for (int i = 0; i < code.length; i++) {
            for (int j = 1; j <= k; j++) {
                int pos = (i + change * j) % code.length;
                if (pos < 0) {
                    pos = code.length + pos;
                }
                result[i] += code[pos];
            }
        }

        return result;
    }

    public int[] decryptPartialSum(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }

        int offset = k > 0 ? 0 : code.length + k - 1;

        int[] partialSum = new int[code.length * 2];
        partialSum[0] = code[0];
        for (int i = 1; i < partialSum.length; i++) {
            partialSum[i] = code[i % code.length] + partialSum[i - 1];
        }

        k = Math.abs(k);
        for (int i = 0; i < code.length; i++) {
            code[i] = partialSum[i + k + offset] - partialSum[i + offset];
        }
        return code;
    }
}
