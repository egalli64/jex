/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import java.util.Arrays;

/**
 * frontPiece - https://codingbat.com/prob/p142455
 * <p>
 * Given an array, generate another one containing its first two elements. If
 * the input is sized 2 or less, the output is going to have the same size.
 */
public class FrontPiece {
    /**
     * Using Arrays
     * 
     * @param nums a possibly empty array
     * @return the first two elements (or less)
     */
    public static int[] solution(int[] nums) {
        return Arrays.copyOf(nums, Math.min(nums.length, 2));
    }

    /**
     * Not using Arrays
     * 
     * @param nums a possibly empty array
     * @return the first two elements (or less)
     */
    public static int[] verbose(int[] nums) {
        int len = Math.min(nums.length, 2);
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[i];
        }
        return result;
    }
}
