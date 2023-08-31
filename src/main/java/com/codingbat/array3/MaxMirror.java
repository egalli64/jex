/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * maxMirror - https://codingbat.com/prob/p196409
 * <p>
 * Find the longest "mirrored" section in the passed array. Same values once
 * read from left to right, once from right to left. It could be a palindrome,
 * or two distinct groups.
 */
public class MaxMirror {
    /**
     * Three nested loops. The external to scan the array left to right. The central
     * to scan it right to left. The most inner to scan the two mirroring group.
     *
     * @param nums an array
     * @return max count of "mirrored" elements
     */
    public static int solution(int[] nums) {
        int result = 0;

        for (int left = 0; left < nums.length; left++) {
            for (int right = nums.length - 1; right > -1; right--) {
                int current = 0;

                for (int i = left, j = right; i < nums.length && j > -1 && nums[i] == nums[j]; i++, j--) {
                    current += 1;
                }

                result = Math.max(result, current);
            }
        }

        return result;
    }
}
