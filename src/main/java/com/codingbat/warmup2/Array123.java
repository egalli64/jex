/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * array123 - https://codingbat.com/prob/p136041
 * <p>
 * Check for the sequence 1, 2, 3 in the passed array
 */
public class Array123 {
    /**
     * Loop until three elements are accessible in the array, and check them
     *
     * @param nums a possibly empty array
     * @return true if contains the sequence 1, 2, 3
     */
    public static boolean solution(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }

        return false;
    }

    /**
     * Keep track of the expected next value in the array, if the expectation for 3
     * is satisfied return true
     *
     * @param nums a possibly empty array
     * @return true if contains the sequence 1, 2, 3
     */
    public static boolean alternative(int[] nums) {
        int next = 1;
        for (int num : nums) {
            if (num == next) {
                if (num == 3) {
                    return true;
                }
                next += 1;
            } else {
                next = num == 1 ? 2 : 1;
            }
        }
        return false;
    }
}
