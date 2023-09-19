/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * array220 - https://codingbat.com/prob/p173469
 * <p>
 * Check recursively if in the passed array, from the passed index on, there is
 * an element directly followed by an element with 10 times its value
 */
public class Array220 {
    /**
     * Base cases:
     * <li>if the index is on the last element, or over, return false
     * <li>otherwise, if the required condition holds, return true
     * <p>
     * Recursive part: recurse on the next index
     *
     * @param nums  an array
     * @param index non-negative, current element
     * @return true if next value is 10x current one
     */
    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        } else if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }

        return array220(nums, index + 1);
    }
}
