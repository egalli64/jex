/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * tenRun - https://codingbat.com/prob/p199484
 * <p>
 * Change all the elements in the passed array from the first multiple of ten
 * on. The followers get the 10x value, until another multiple of ten is seen
 * and used for its followers (and so on).
 */
public class TenRun {
    /**
     * Use a flag to keep track of the 10x value detection, and store the 10x value
     * in a variable. Check each element in the array, when a 10x value is seen,
     * store it as changer and put the flag up. If the current value is not a 10x
     * and previously a 10x has been detected, change it.
     * 
     * @param nums an array
     * @return 10x changes the followers to itself, until next 10x
     */
    public static int[] solution(int[] nums) {
        boolean active = false;
        int changer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                changer = nums[i];
                active = true;
            } else if (active) {
                nums[i] = changer;
            }
        }

        return nums;
    }
}
