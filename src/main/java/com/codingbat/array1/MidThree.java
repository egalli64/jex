/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * midThree - https://codingbat.com/prob/p155713
 * <p>
 * Assuming the input array has an odd size, at least three, return a new array
 * containing the three input central elements
 */
public class MidThree {
    /**
     * Initialize the new array "by hand"
     * 
     * @param nums an array of ints of odd length, at least 3
     * @return a new array containing only the middle three elements
     */
    public static int[] solution(int[] nums) {
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
    }
}
