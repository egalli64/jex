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
     * Two nested loop. The external one looks for each pair where the first element
     * is a 3 and the second is _not_ a 4. When found, the internal loop looks for a
     * 4 _not_ in a 3/4 pair and swap it to the element next to the current 3.
     * <li>to save time, keep track of the last found, and look for the next one
     * <li>no need to check if a four is in first position (so can't check for the
     * predecessor) since this is given as precondition
     *
     * @param nums an array
     * @return the fixed array
     */
    public static int[] solution(int[] nums) {
        int j4 = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (j4 += 1; j4 < nums.length; j4++) {
                    if (nums[j4] == 4 && nums[j4 - 1] != 3) {
                        i += 1;
                        nums[j4] = nums[i];
                        nums[i] = 4;
                        break;
                    }
                }
            }
        }

        return nums;
    }

    /**
     * Same logic as the other solution, but the internal loop takes advantage of
     * the precondition ensuring that for each three there must be a four.
     * 
     * @param nums an array
     * @return the fixed array
     */
    public static int[] alternative(int[] nums) {
        int j4 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                while (nums[j4] != 4 || nums[j4 - 1] == 3) {
                    j4 += 1;
                }

                i += 1;
                nums[j4] = nums[i];
                nums[i] = 4;
            }
        }

        return nums;
    }
}
