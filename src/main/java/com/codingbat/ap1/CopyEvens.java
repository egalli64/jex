/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.Arrays;

/**
 * copyEvens - https://codingbat.com/prob/p134174
 * <p>
 * Copy the first count even elements of the passed array in a newly generated
 * array. Is caller responsibility passing good arguments.
 */
public class CopyEvens {
    /**
     * Generate an array sized count, populate it with the first count even elements
     * of the input array
     *
     * @param nums  an array
     * @param count output size
     * @return generated partial copy array
     */
    public static int[] solution(int[] nums, int count) {
        int[] result = new int[count];

        for (int i = 0, j = 0; j < count; i++) {
            if (nums[i] % 2 == 0) {
                result[j++] = nums[i];
            }
        }

        return result;
    }

    /**
     * By Java 8 stream. Filter the even elements, limit to the first count ones,
     * collect to an array.
     * 
     * @param nums  an array
     * @param count output size
     * @return generated partial copy array
     */
    public static int[] modern(int[] nums, int count) {
        return Arrays.stream(nums).filter(x -> x % 2 == 0).limit(count).toArray();
    }
}
