/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * array11 - https://codingbat.com/prob/p135988
 * <p>
 * Count recursively the 11 in the passed array, from the passed index on
 */
public class Array11 {
    /**
     * Base case: if the index is beyond the upper bound, return 0
     * <p>
     * Recursive part: recurse for the next index, adding 1 to its returned value if
     * the current element is 11
     *
     * @param nums  an array
     * @param index current position to consider
     * @return number of 11 from this point on
     */
    public static int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        int counter = nums[index] == 11 ? 1 : 0;
        return counter + array11(nums, index + 1);
    }
}
