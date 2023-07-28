/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * swapEnds - https://codingbat.com/prob/p118044
 * <p>
 * Assuming the input array is non-empty, swap its first element with the last
 * one.
 */
public class SwapEnds {
    /**
     * By hand
     * 
     * @param nums a non-empty array
     * @return first swapped with last
     */
    public static int[] solution(int[] nums) {
        int buffer = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = buffer;
        return nums;
    }
}
