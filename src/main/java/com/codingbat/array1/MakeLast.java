/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * makeLast - https://codingbat.com/prob/p137188
 * <p>
 * Create an array, doubling the size of the passed one, copying the original
 * last element in the last position of the new one, and leaving zeroes in the
 * other places
 */
public class MakeLast {
    /**
     * Nothing fancy
     * 
     * @param nums a non empty array
     * @return an array double sized, all zeroes, same last element
     */
    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
}
