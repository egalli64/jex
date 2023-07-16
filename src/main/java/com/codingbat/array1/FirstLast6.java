/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * firstLast6 - https://codingbat.com/prob/p185685
 * <p>
 * check if the passes non-empty integer array has 6 in the first or last
 * element
 */
public class FirstLast6 {
    /**
     * array access + OR logic
     *
     * @param nums a non-empty array of int
     * @return true if first or last element is 6
     */
    public static boolean solution(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
