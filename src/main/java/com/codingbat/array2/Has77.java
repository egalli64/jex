/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * has77 - https://codingbat.com/prob/p168357
 * <p>
 * Check the in the passed arrays there are at least two 7 next to each other,
 * or separated by just another element
 */
public class Has77 {
    /**
     * If the array is so short that it contains no pair, return false. If it is
     * sized two, check both elements, otherwise check each triplet.
     * 
     * @param nums an array
     * @return true if contains sub [7, 7] or [7, x, 7]
     */
    public static boolean solution(int[] nums) {
        if (nums.length <= 1) {
            return false;
        } else if (nums.length == 2) {
            return nums[0] == 7 && nums[1] == 7;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == 7 && nums[i + 1] == 7) {
                return true;
            } else if (nums[i] == 7 && (nums[i - 1] == 7 || nums[i + 1] == 7)) {
                return true;
            }
        }

        return false;
    }
}
