/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * array667 - https://codingbat.com/prob/p110019
 * <p>
 * count the couples of both 6, 6 and 6, 7 in the passed array
 */
public class Array667 {
    /**
     * check the current value for 6, and the next for 6 or 7
     * 
     * @param nums an array
     * @return count of relevant couples
     */
    public static int solution(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result += 1;
            }
        }

        return result;
    }
}
