/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * arrayFront9 - https://codingbat.com/prob/p186031
 * <p>
 * Check in the first 4 elements (could be less) there is at least a nine.
 */
public class ArrayFront9 {
    /**
     * Loop on the first 4 (or len) array elements
     * 
     * @param nums a possibly empty array
     * @return true if there is a 9 in the first four positions
     */
    public static boolean solution(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
