/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * only14 - https://codingbat.com/prob/p186672
 * <p>
 * Check if the passed arrays contains just 1s and 4s
 */
public class Only14 {
    /**
     * Loop on all the array elements, return false if a 1 or 4 is found
     * 
     * @param nums an array
     * @return true if only 1 and 4 are in it
     */
    public static boolean solution(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
