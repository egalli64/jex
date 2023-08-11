/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * sum28 - https://codingbat.com/prob/p199612
 * <p>
 * Check if the passed array exactly four times the value 2
 */
public class Sum28 {
    /**
     * Keep a counter for 2 values, check it after looping
     * 
     * @param nums an array
     * @return true if sum of 2s is 8
     */
    public static boolean solution(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 2) {
                count += 1;
            }
        }
        return count == 4;
    }
}
