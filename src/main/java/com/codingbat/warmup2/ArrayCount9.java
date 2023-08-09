/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import java.util.Arrays;

/**
 * arrayCount9 - https://codingbat.com/prob/p184031
 * <p>
 * Count the number of elements valued 9 in the passed array
 */
public class ArrayCount9 {
    /**
     * Loop on the array, increase the counter when required
     * 
     * @param nums an array
     * @return the number of 9 in it
     */
    public static int solution(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (i == 9) {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * Streaming the array
     * 
     * @param nums an array
     * @return the number of 9 in it
     */
    public static int modern(int[] nums) {
        return Arrays.stream(nums).map(i -> i == 9 ? 1 : 0).sum();
    }
}
