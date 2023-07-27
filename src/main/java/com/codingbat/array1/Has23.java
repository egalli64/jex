/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * has23 - https://codingbat.com/prob/p171022
 * <p>
 * check if the passed array, sized 2, contains 2 or 3
 */
public class Has23 {
    /**
     * Just check all the four possible cases, one by one
     * 
     * @param nums an array sized 2
     * @return true if contains 2 or 3
     */
    public static boolean solution(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }

    /**
     * Loop on the array elements, checking the current one
     * 
     * @param nums an array (expected size is 2, but could be anything)
     * @return true if contains 2 or 3
     */
    public static boolean robustness(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }
}
