/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * fix34 - https://codingbat.com/prob/p159339
 * <p>
 * Given an array that contains the same number of 3 and 4, no 3 is in the last
 * position, no 3 follows another 3, the first 3 is not preceded by any 4. The 3
 * can't be moved, the other elements should be rearranged so that each 3 is
 * followed by a 4.
 */
public class Fix34 {
    /**
     * Two nested for loop. The external one looks for each 3 element. When a 3 is
     * found, the internal loop looks for a 4 (to save time, keep track of the last
     * one found, and look for the next one) and swap it to the element next to the
     * current 3.
     *
     * @param nums contains the same number of 3 and 4
     * @return 3 are in fixed position, 4 should follow
     */
    public static int[] solution(int[] nums) {
        int fourPos = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                for (int j = fourPos + 1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        i += 1;
                        nums[j] = nums[i];
                        nums[i] = 4;
                        fourPos = j;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}
