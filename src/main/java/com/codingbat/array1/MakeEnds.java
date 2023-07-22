/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * makeEnds - https://codingbat.com/prob/p101230
 * <p>
 * Given a non-empty arrays, generate a new 2-sized array with its first and
 * last elements
 */
public class MakeEnds {

    /**
     * Create a two-element array on the fly
     * 
     * @param nums a non empty array
     * @return first and last
     */
    public static int[] solution(int[] nums) {
        return new int[] { nums[0], nums[nums.length - 1] };
    }
}
