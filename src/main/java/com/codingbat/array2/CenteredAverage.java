/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * centeredAverage - https://codingbat.com/prob/p136585
 * <p>
 * Calculate the "centered" integer average, ignoring both one extreme minimum
 * and maximum, from the input array, sized 3+
 */
public class CenteredAverage {
    /**
     * Accumulate the values in input, keeping track of minimum and maximum, then
     * remove them from the result before dividing for their size
     * 
     * @param nums an array
     * @return the "centered" integer average
     */
    public static int solution(int[] nums) {
        int minimum = nums[0];
        int maximum = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result += nums[i];
            if (nums[i] < minimum) {
                minimum = nums[i];
            } else if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }

        return (result - maximum - minimum) / (nums.length - 2);
    }

    /**
     * Same as other solution, but using Math::min/max
     * 
     * @param nums an array
     * @return the "centered" integer average
     */
    public static int alternative(int[] nums) {
        int minimum = nums[0];
        int maximum = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result += nums[i];
            minimum = Math.min(nums[i], minimum);
            maximum = Math.max(nums[i], maximum);
        }

        return (result - maximum - minimum) / (nums.length - 2);
    }
}
