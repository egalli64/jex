/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * sum2 - https://codingbat.com/prob/p190968
 * <p>
 * Calculate the sum of the first two (or less) elements
 */
public class Sum2 {
    /**
     * Get the actual number of elements to loop on, then accumulate
     * 
     * @param nums a possibly empty array
     * @return the sum of the first two elements, if available
     */
    public static int solution(int[] nums) {
        final int len = Math.min(nums.length, 2);
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += nums[i];
        }
        return result;
    }
}
