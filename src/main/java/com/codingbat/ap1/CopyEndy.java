/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.Arrays;

/**
 * copyEndy - https://codingbat.com/prob/p130124
 * <p>
 * Say that an integer is "endy" if it is in [0..10] or in [90..100]. Copy the
 * first count "endy" elements of the passed array in a newly generated array.
 * It is caller responsibility passing good arguments.
 */
public class CopyEndy {
    /**
     * Delegate to {@linkplain CopyEndy#isEndy(int)} the check for "endy" value.
     * <p>
     * Create an array sized count. Loop on nums. Copy the first "endy" values into
     * the new array.
     *
     * @param nums  an array
     * @param count non-negative
     * @return the new filtered array
     */
    public static int[] solution(int[] nums, int count) {
        int[] result = new int[count];

        for (int i = 0, j = 0; j < count; i++) {
            if (isEndy(nums[i])) {
                result[j++] = nums[i];
            }
        }

        return result;
    }

    /**
     * Delegate to {@linkplain CopyEndy#isEndy(int)} the check for "endy" value.
     * <p>
     * Stream (Java 8) the array. Filter the isEndy values, limit the result to the
     * first count elements. Collect the result in the resulting array.
     * 
     * @param nums  an array
     * @param count non-negative
     * @return the new filtered array
     */
    public static int[] modern(int[] nums, int count) {
        return Arrays.stream(nums).filter(CopyEndy::isEndy).limit(count).toArray();
    }

    /**
     * Check if the passed value is in [0..10] or [90..100]
     *
     * @param value a value
     * @return true if accepted
     */
    static boolean isEndy(int value) {
        return value >= 0 && value <= 10 || value >= 90 && value <= 100;
    }
}
