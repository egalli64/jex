/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import java.util.Arrays;

/**
 * post4 - https://codingbat.com/prob/p164144
 * <p>
 * Generate a copy of the passed array containing only the elements after the
 * last 4 (assume the arrays contains at least one 4)
 */
public class Post4 {
    /**
     * Execute a reverse loop to find the last four position, create an array by
     * Arrays::copyOfRange
     * 
     * @param nums a non-empty array, with at least a 4
     * @return the resulting array
     */
    public static int[] solution(int[] nums) {
        int i = nums.length - 1;
        while (nums[i] != 4) {
            i -= 1;
        }
        return Arrays.copyOfRange(nums, i + 1, nums.length);
    }

    /**
     * Execute a reverse loop to find the position of the first element following
     * the last 4, create a new array, sized to keep the tail elements from the
     * passed array. Assign the right values to the elements in the new array.
     * 
     * @param nums a non-empty array, with at least a 4
     * @return the resulting array
     */
    public static int[] verbose(int[] nums) {
        int first = nums.length;
        while (nums[first - 1] != 4) {
            first -= 1;
        }

        int len = nums.length - first;

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[first + i];
        }

        return result;
    }
}
