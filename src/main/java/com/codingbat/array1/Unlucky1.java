/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * unlucky1 - https://codingbat.com/prob/p197308
 * <p>
 * Given an array, check if it has two adjacent element, one and three, in the
 * array head, with one in position 0 or 1, or in its tail, with three in the
 * last position.
 */
public class Unlucky1 {
    /**
     * Check the three cases, pay attention to the actual array size
     * 
     * @param nums an array
     * @return true if 1 followed by 3 in head or tail
     */
    public static boolean solution(int[] nums) {
        if (nums.length > 1 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }

        if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }

        final int last = nums.length - 1;
        if (nums.length > 3 && nums[last - 1] == 1 && nums[last] == 3) {
            return true;
        }

        return false;
    }
}
