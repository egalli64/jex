/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * no23 - https://codingbat.com/prob/p175689
 * <p>
 * check if the passed array, sized 2, does not contain 2 or 3
 */
public class No23 {
    /**
     * Check "by hand" all the four possible cases
     *
     * @param nums an array sized 2
     * @return true if no 2, 3 in it
     */
    public static boolean solution(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }
    

    /**
     * Loop on the array elements, checking the current one
     * 
     * @param nums an array (expected size is 2, but could be anything)
     * @return true if no 2 or 3 in it
     */
    public static boolean robustness(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }
}
