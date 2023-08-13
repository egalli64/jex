/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * either24 - https://codingbat.com/prob/p191878
 * <p>
 * Check if in the passed array there is at least a pair of 2s or 4s, but not
 * both
 */
public class Either24 {
    /**
     * Check each pair, keep track of 2s and 4s. Use XOR to return the expected
     * result
     * 
     * @param nums an array
     * @return true if contains sub [2, 2] of [4, 4], but not both
     */
    public static boolean solution(int[] nums) {
        boolean sub2 = false;
        boolean sub4 = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) {
                sub2 = true;
            }
            if (nums[i] == 4 && nums[i - 1] == 4) {
                sub4 = true;
            }
        }
        return sub2 ^ sub4;
    }
}
