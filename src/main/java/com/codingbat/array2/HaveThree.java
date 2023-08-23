/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * haveThree - https://codingbat.com/prob/p109783
 * <p>
 * Check if in the passed array contains exactly three _separated_ 3
 */
public class HaveThree {
    /**
     * If the array is not empty, check it first element and initialize a 3-counter
     * accordingly. Then loop on all the other values checking for 3 that are not
     * followed by another 3.
     * 
     * @param nums an array
     * @return true if there is a "sparse" 3 triplet
     */
    public static boolean solution(int[] nums) {
        int count = nums.length > 0 && nums[0] == 3 ? 1 : 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i - 1] == 3) {
                    return false;
                }
                count += 1;
            }
        }

        return count == 3;
    }
}
