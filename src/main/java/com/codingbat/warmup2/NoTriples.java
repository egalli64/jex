/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * noTriples - https://codingbat.com/prob/p170221
 * <p>
 * check if the input array does not contain three equal values in a row.
 */
public class NoTriples {
    /**
     * For each triplet check if the first element is same than the other two.
     * 
     * @param nums a possibly empty array
     * @return true if it does not contain any chained triplet
     */
    public static boolean solution(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Count duplicates, if the count reach 3, return false
     *
     * @param nums a possibly empty array
     * @return true if it does not contain any chained triplet
     */
    public static boolean countDuplicates(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        int count = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current) {
                count += 1;
                if (count == 3) {
                    return false;
                }
            } else {
                count = 1;
                current = nums[i];
            }
        }
        return true;
    }
}
