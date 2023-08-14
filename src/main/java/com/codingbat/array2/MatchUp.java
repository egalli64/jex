/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * matchUp - https://codingbat.com/prob/p136254
 * <p>
 * Check the two passed arrays, same size assumed, counting how many elements in
 * the same position differ by 2 or less, but are not equal
 */
public class MatchUp {
    /**
     * Loop on all elements increase the counter when the condition is matched
     *
     * @param nums1 an array
     * @param nums2 another array, same size
     * @return times that the elements in the same position
     */
    public static int solution(int[] nums1, int[] nums2) {
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);
            if (difference > 0 && difference <= 2) {
                result += 1;
            }
        }
        return result;
    }
}
