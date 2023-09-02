/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * tripleUp - https://codingbat.com/prob/p137874
 * <p>
 * check if the array contains a triplet of integers increasing by 1
 */
public class TripleUp {
    /**
     * Check each triplet for the required configuration
     * 
     * @param nums an array
     * @return true if accepted
     */
    public static boolean solution(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }
        return false;
    }
}
