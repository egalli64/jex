/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * bigDiff - https://codingbat.com/prob/p196640
 * <p>
 * Get the difference between largest and smallest value in the input
 * (non-empty) array
 */
public class BigDiff {
    /**
     * Initialize small/large with the first element in the array, loop on all the
     * elements, adjust the values as required, then return their difference
     * 
     * @param nums non-empty
     * @return difference between largest and smallest value
     */
    public static int solution(int[] nums) {
        int small = nums[0];
        int large = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            } else if (nums[i] > large) {
                large = nums[i];
            }
        }

        return large - small;
    }

    /**
     * Use Math::min/max to change small/large when required
     * 
     * @param nums non-empty
     * @return difference between largest and smallest value
     */
    public static int alternative(int[] nums) {
        int small = nums[0];
        int large = nums[0];

        for (int i = 1; i < nums.length; i++) {
            small = Math.min(nums[i], small);
            large = Math.max(nums[i], large);
        }

        return large - small;
    }
}
