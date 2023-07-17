/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * reverse3 - https://codingbat.com/prob/p112409
 * <p>
 * given an array sized 3, return an array with the elements in reversed order
 */
public class Reverse3 {
    /**
     * do the inversion "by hand"
     *
     * @param nums an array of int sized 3
     * @return a reversed copy of the input array
     */
    public static int[] solution(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }

    /**
     * set the values by looping
     *
     * @param nums an array of int sized 3
     * @return a reversed copy of the input array
     */
    public static int[] robustness(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - i - 1];
        }

        return result;
    }
}
