/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * rotateLeft3 - https://codingbat.com/prob/p185139
 * <p>
 * given an array sized 3, rotate left its elements. So, each values "move" to
 * the left, the value in the first position goes to the end.
 */
public class RotateLeft3 {
    /**
     * Generalized swap
     * 
     * @param nums an array sized 3
     * @return a rotation left
     */
    public static int[] solution(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;

        return nums;
    }

    /**
     * ready to possible future changes
     * 
     * @param nums an array sized 3
     * @return a rotation left
     */
    public static int[] robustness(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;

        return nums;
    }
}
