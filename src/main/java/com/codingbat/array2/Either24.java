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
     * @return true if contains a pair [2, 2] or [4, 4], but not both
     */
    public static boolean solution(int[] nums) {
        boolean pair2 = false;
        boolean pair4 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                pair2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                pair4 = true;
            }
        }
        return pair2 ^ pair4;
    }
}
