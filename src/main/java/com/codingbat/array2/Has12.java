/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * has12 - https://codingbat.com/prob/p169260
 * <p>
 * Check the in the passed arrays has a 1 followed (maybe later) by a 2
 */
public class Has12 {
    /**
     * Loop on all the array elements, use a flag to check if a 1 has been found, it
     * that is the case and the current value is 2, return true.
     * 
     * @param nums an array
     * @return true if 1 .. 2 are found
     */
    public static boolean solution(int[] nums) {
        boolean hasOne = false;

        for (int i = 0; i < nums.length; i++) {
            if (hasOne && nums[i] == 2) {
                return true;
            } else if (nums[i] == 1) {
                hasOne = true;
            }
        }

        return false;
    }
}
