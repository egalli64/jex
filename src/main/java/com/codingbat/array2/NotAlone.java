/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * notAlone - https://codingbat.com/prob/p169506
 * <p>
 * An element is said to be "alone" if it is not in first/last position, and
 * neither of its neighbor has its value
 * <p>
 * Modify the passed array, replacing each "alone" value (passed as second
 * argument) with its larger neighbor.
 */
public class NotAlone {
    /**
     * Check each value, but the first and last. If "alone", reset it.
     * 
     * @param nums an array
     * @param val  to be changed
     * @return changed val with the highest neighbor, when not in extreme position
     */
    public static int[] solution(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }
}
