/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import java.util.Arrays;

/**
 * pre4 - https://codingbat.com/prob/p100246
 * <p>
 * Generate a copy of the passed array limited up to the first element
 * containing a 4 (excluded)
 */
public class Pre4 {
    /**
     * Get the length of the new array, looking for the first 4 in input. Then
     * generate a copy by Arrays::copy
     * 
     * @param nums an array
     * @return a (reduced) copy of the input array
     */
    public static int[] solution(int[] nums) {
        int len = 0;
        while (nums[len] != 4) {
            len += 1;
        }
        return Arrays.copyOf(nums, len);
    }

    /**
     * Get the length of the new array, looking for the first 4 in input. Create the
     * new array, and fill it with copies from the original array
     * 
     * @param nums an array
     * @return a (reduced) copy of the input array
     */
    public static int[] verbose(int[] nums) {
        int len = 0;
        while (nums[len] != 4) {
            len += 1;
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
