/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * shiftLeft - https://codingbat.com/prob/p105031
 * <p>
 * Generate a new array, or modify the passed one, shifting it left. Meaning,
 * the leftmost element should become the rightmost, the other elements should
 * move left by one step.
 */
public class ShiftLeft {
    /**
     * In-place solution. If the array has less than two elements, there is nothing
     * to do. Otherwise perform a generalized swap, putting the value of the first
     * element in a buffer, shifting all the other elements to the left, and finally
     * putting the buffer value in the last element.
     * 
     * @param nums an array
     * @return left shifted array
     */
    public static int[] solution(int[] nums) {
        if (nums.length > 1) {
            int buffer = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = buffer;
        }

        return nums;
    }

    /**
     * Copy solution. Create a new array, same size of the input one. Copy each
     * input element (but the first) to the new array, one step to its left. Copy
     * the first input element in the last position of the new one.
     * 
     * @param nums an array
     * @return left shifted array
     */
    public static int[] solutionCopy(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            result[i - 1] = nums[i];
        }
        result[result.length - 1] = nums[0];

        return result;
    }
}
