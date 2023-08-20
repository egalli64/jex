/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * isEverywhere - https://codingbat.com/prob/p110222
 * <p>
 * Check if the given value is in each pair of element in the passed arrays. If
 * the array is too short to be checked, return true.
 */
public class IsEverywhere {
    /**
     * Check all the pairs for the expected value
     * 
     * @param nums an array
     * @param val  a value
     * @return true if value is found for each pair
     * @apiNote arrays sized less than 2 lead always to true
     */
    public static boolean solution(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }
}
