/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import java.util.Arrays;

/**
 * canBalance - https://codingbat.com/prob/p158767
 * <p>
 * Given a non-empty array, check if it could be split it two parts with same
 * sum.
 */
public class CanBalance {
    /**
     * Divide the array in two partitions, left and right, one empty, the other
     * containing all the elements. Loop on all the elements, moving the current one
     * from one side to the other. If, after the current move, the two parts are
     * balanced, return success.
     * 
     * @param nums an array
     * @return true if can be balanced
     * @apiNote using the implicit assumption that the array has non-zero sum
     */
    public static boolean solution(int[] nums) {
        int left = 0;
        int right = Arrays.stream(nums).sum();

        for (int num : nums) {
            left += num;
            right -= num;
            if (left == right) {
                return true;
            }
        }

        return false;
    }

    /**
     * To be balanced, the two parts should have the same sum, that is, half the
     * total array sum. After ensuring that it is even, divide it by 2. Loop on all
     * the element, removing it from the half-sum, until it is positive. Reaching
     * exactly zero means the balanced split is possible.
     *
     * @param nums an array
     * @return true if can be balanced
     */
    public static boolean alternative(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            return false;
        }

        sum /= 2;
        for (int i = 0; sum > 0; i++) {
            sum -= nums[i];
        }

        return sum == 0;
    }
}
