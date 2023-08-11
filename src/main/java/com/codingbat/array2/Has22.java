/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * has22 - https://codingbat.com/prob/p121853
 * <p>
 * Check if the passed array contains two 2 in a row
 */
public class Has22 {
    /**
     * Check all pairs in the array, as soon as a double two is detected return true
     * 
     * @param nums an array
     * @return true if contains subsequence [2, 2]
     */
    public static boolean solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }
}
