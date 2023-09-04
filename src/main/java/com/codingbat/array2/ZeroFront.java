/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * zeroFront - https://codingbat.com/prob/p193753
 * <p>
 * Return an array (or the same array modified in-place) where the 0 values are
 * moved at the beginning. The order of other values doesn't matter, you can
 * assume there are just two values, zero and non-zero.
 */
public class ZeroFront {
    /**
     * Create a new array, same size of input, loop on input, each non-zero value
     * would go to the bottom - keep trace of the index where the next one should go
     * 
     * @param nums an array
     * @return rearranged array
     */
    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];

        int i = result.length - 1;
        for (int num : nums) {
            if (num != 0) {
                result[i] = num;
                i -= 1;
            }
        }

        return result;
    }

    /**
     * In-place version. Loop on the array from both left and right. Swap a pair if
     * left is non-zero and right is zero. Otherwise move left/right indices if the
     * respective elements are already in the right place
     * 
     * @param nums an array
     * @return rearranged array
     */
    public static int[] inPlace(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j;) {
            if (nums[i] != 0 && nums[j] == 0) {
                int buffer = nums[i];
                nums[i] = nums[j];
                nums[j] = buffer;
                i += 1;
                j -= 1;
            } else {
                if (nums[i] == 0) {
                    i += 1;
                }
                if (nums[j] != 0) {
                    j -= 1;
                }
            }
        }

        return nums;
    }
}
