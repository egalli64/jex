/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * sameEnds - https://codingbat.com/prob/p134300
 * <p>
 * Check if the array head and tail are same for the size specified (assume it
 * in the correct range).
 */
public class SameEnds {
    /**
     * Loop on the array using a "normal" i and j, set to the tail first index.
     * 
     * @param nums an array
     * @param len  the head/tail size
     * @return true if head and tail are same
     */
    public static boolean solution(int[] nums, int len) {
        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            if (nums[i] != nums[j]) {
                return false;
            }
        }
        return true;
    }
}
