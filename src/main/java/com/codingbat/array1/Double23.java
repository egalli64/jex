/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * double23 - https://codingbat.com/prob/p145365
 * <p>
 * Check if the passed array, sized up to 2, contains a couple of 2 or 3
 */
public class Double23 {
    /**
     * Count 2 and 3
     * 
     * @param nums an array sized 2-
     * @return true if contains a couple of 2 or 3
     */
    public static boolean counting(int[] nums) {
        int count2 = 0;
        int count3 = 0;

        for (int num : nums) {
            if (num == 2) {
                count2 += 1;
            } else if (num == 3) {
                count3 += 1;
            }
        }

        return count2 == 2 || count3 == 2;
    }

    /**
     * Check and compare
     * 
     * @param nums an array sized 2-
     * @return true if contains a couple of 2 or 3
     */
    public static boolean solution(int[] nums) {
        if (nums.length < 2 || nums[0] != 2 && nums[0] != 3) {
            return false;
        }

        return nums[0] == nums[1];
    }
}
