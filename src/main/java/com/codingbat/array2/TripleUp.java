/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * tripleUp - https://codingbat.com/prob/p137874
 * <p>
 * check if the array contains a triplet of integers increasing by 1
 */
public class TripleUp {
    /**
     * Check each triplet from the middle element, if the previous is -1 and the
     * next is +1, the triplet is found
     * 
     * @param nums an array
     * @return true if contains a sub of three increasing adjacent ints
     */
    public static boolean solution(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i] - 1 && nums[i] == nums[i + 1] - 1) {
                return true;
            }
        }
        return false;
    }
}
