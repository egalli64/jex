/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * sameFirstLast - https://codingbat.com/prob/p118976
 * <p>
 * check if the value in the first and last element is the same - empty array
 * should lead to false
 */
public class SameFirstLast {
    /**
     * check length, access element, AND logical connector
     * 
     * @param nums an array of integers
     * @return true if is not empty and first and last are equals
     */
    public static boolean solution(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    /**
     * check length, access element
     * 
     * @param nums an array of integers
     * @return true if is not empty and first and last are equals
     */
    public static boolean verbose(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else {
            return nums[0] == nums[nums.length - 1];
        }
    }
}
