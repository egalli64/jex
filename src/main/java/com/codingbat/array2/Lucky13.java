/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * lucky13 - https://codingbat.com/prob/p194525
 * <p>
 * Check if the passed array contains no 1 nor 3
 */
public class Lucky13 {
    /**
     * Loop on all the elements, return false if an element is one or three
     *
     * @param nums a possibly empty array of integers
     * @return true if nums does not contain 1 or 3
     */
    public static boolean solution(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }

        return true;
    }
}
