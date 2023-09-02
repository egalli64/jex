/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * twoTwo - https://codingbat.com/prob/p102145
 * <p>
 * Check if every 2 in the array is next to another 2
 */
public class TwoTwo {
    /**
     * Accept empty array and array with single element not 2.
     * <p>
     * If there are at least 2 elements, check the first element, if it is a 2, also
     * the second one should a 2.
     * <p>
     * For each triplet in the array check the central element, if it is an isolated
     * 2, the requested condition is not satisfied.
     * <p>
     * Finally, check the last element, if not-2, it is OK, otherwise the previous
     * element should be a 2, too.
     * 
     * @param nums an array
     * @return true if accepted
     */
    public static boolean solution(int[] nums) {
        if (nums.length == 0) {
            return true;
        } else if (nums.length == 1) {
            return nums[0] != 2;
        }

        if (nums[0] == 2 && nums[1] != 2) {
            return false;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2) {
                return false;
            }
        }

        return nums[nums.length - 1] != 2 || nums[nums.length - 2] == 2;
    }
}
