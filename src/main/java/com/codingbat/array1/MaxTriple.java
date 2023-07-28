/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * maxTriple - https://codingbat.com/prob/p185176
 * <p>
 * Assuming the input array is non-empty and has an odd size, return the largest
 * value among its first, middle, and last element.
 */
public class MaxTriple {
    /**
     * Using two times Math.max()
     * 
     * @param nums an array of odd size, 1+
     * @return the largest element among first, central, last
     */
    public static int solution(int[] nums) {
        return Math.max(Math.max(nums[0], nums[nums.length - 1]), nums[nums.length / 2]);
    }
}
