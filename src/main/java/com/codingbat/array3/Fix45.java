/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * fix45 - https://codingbat.com/prob/p125819
 * <p>
 * Given an array that contains the same number of 4 and 5, no 4 is in the last
 * position, no 4 follows another 4. The 4 can't be moved, the other elements
 * should be rearranged so that each 4 is followed by a 5. Notice that the
 * element 5 are allowed to be anywhere.
 */
public class Fix45 {
    /**
     * Two nested loops. The external one loops on each pair in the array, where the
     * first element is a 4 and the second one is _not_ a 5. The internal loop get
     * the index of the first 5 not already taken and not in a 4/5 pair. Then swap
     * the found elements to fix the current couple.
     *
     * @param nums an array
     * @return the input array, fixed
     */
    public static int[] solution(int[] nums) {
        int j5 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                while (nums[j5] != 5 || (j5 != 0 && nums[j5 - 1] == 4)) {
                    j5 += 1;
                }

                i += 1;
                nums[j5] = nums[i];
                nums[i] = 5;
            }
        }

        return nums;
    }
}
