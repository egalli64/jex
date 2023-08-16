/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * zeroMax - https://codingbat.com/prob/p187050
 * <p>
 * Replace in the passed array each zero with the largest odd value to its right
 * (if any)
 */
public class ZeroMax {
    /**
     * Loop on the array from right to left. Keep in a buffer the current largest
     * odd value, ensure each time it is still the largest one. If the current value
     * is zero, change it with the buffer value
     * 
     * @param nums an array
     * @return input array, changed in-place
     */
    public static int[] solution(int[] nums) {
        int changer = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i] = changer;
            } else if (nums[i] > changer && nums[i] % 2 == 1) {
                changer = nums[i];
            }
        }

        return nums;
    }
}
