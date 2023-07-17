/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * sum3 - https://codingbat.com/prob/p175763
 * <p>
 * given an array sized 3, return the sum of its elements
 */
public class Sum3 {
    /**
     * access the elements, sum their values
     * 
     * @param nums an array sized 3
     * @return the sum of all the elements
     */
    public static int solution(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    /**
     * ready to possible future changes
     * 
     * @param nums an array sized 3
     * @return the sum of all the elements
     */
    public static int robustness(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }
}
