/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * makeMiddle - https://codingbat.com/prob/p199519
 * <p>
 * Knowing that the passed array is non-empty and has even size, return a new
 * array with its two central values
 */
public class MakeMiddle {
    /**
     * Generate the new array on the fly
     * 
     * @param nums an array of ints of even length, at least 2
     * @return a new array containing only the middle two elements
     */
    public static int[] solution(int[] nums) {
        final int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle] };
    }
}
