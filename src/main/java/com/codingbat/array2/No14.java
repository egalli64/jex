/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * no14 - https://codingbat.com/prob/p136648
 * <p>
 * Check if the passed arrays contains no 1s or no 4s
 */
public class No14 {
    /**
     * Keep track of 1 and 4 seen when looping on the array
     *
     * @param nums an array of int
     * @return true if no 1 or no 4 in it
     */
    public static boolean solution(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {
            if (num == 1) {
                count1 += 1;
            } else if (num == 4) {
                count4 += 1;
            }
        }
        return count1 == 0 || count4 == 0;
    }
}
