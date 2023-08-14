/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * modThree - https://codingbat.com/prob/p159979
 * <p>
 * Check if in the passed array there is a triplet of even or odd values
 */
public class ModThree {
    /**
     * Check all the triples in the array
     * 
     * @param nums an array
     * @return true if a triplet is found
     */
    public static boolean solution(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) {
                return true;
            }
            if (nums[i - 1] % 2 == 1 && nums[i] % 2 == 1 && nums[i + 1] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
