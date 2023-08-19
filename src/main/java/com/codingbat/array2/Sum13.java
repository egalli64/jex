/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * sum13 - https://codingbat.com/prob/p127384
 * <p>
 * Sum up all the elements in the passed array, excluding the ones set to 13 and
 * their next element
 */
public class Sum13 {
    /**
     * Add to result each value in the array different from 13 and that is not
     * marked to be skipped. The flag to skip the next element is raised only if the
     * current value is 13.
     * 
     * @param nums a possibly empty array of integers
     * @return the conditional sum
     */
    public static int skipper(int[] nums) {
        int result = 0;

        boolean skip = false;
        for (int num : nums) {
            if (num != 13 && !skip) {
                result += num;
            }
            skip = num == 13;
        }

        return result;
    }

    /**
     * Initialize the accumulator with the first element in the array, if available
     * and not 13. Then loop on all the other elements, increasing the accumulator,
     * when required.
     * 
     * @param nums a possibly empty array of integers
     * @return the conditional sum
     */
    public static int solution(int[] nums) {
        int result = (nums.length == 0 || nums[0] == 13) ? 0 : nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 13 && nums[i - 1] != 13) {
                result += nums[i];
            }
        }

        return result;
    }
}
