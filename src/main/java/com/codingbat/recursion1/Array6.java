/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * array6 - https://codingbat.com/prob/p108997
 * <p>
 * Check recursively if the passed array, from the passed index on, contains a 6
 */
public class Array6 {
    /**
     * Base case: if the index is beyond the upper bound return false
     * <p>
     * Recursive part: if the current element is 6 return true, otherwise recurse
     * increasing the index
     *
     * @param nums  an array
     * @param index non-negative, the current position
     * @return true if contains 6
     */
    public static boolean array6(int[] nums, int index) {
        if (index > nums.length - 1) {
            return false;
        }

        return nums[index] == 6 || array6(nums, index + 1);
    }
}
