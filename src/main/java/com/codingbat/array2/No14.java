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
     * Loop on the array, keep track when a 1 or a 4 is seen
     *
     * @param nums an array of int
     * @return true if no 1 or no 4 in it
     */
    public static boolean solution(int[] nums) {
        boolean no1 = true;
        boolean no4 = true;
        for (int num : nums) {
            if (num == 1) {
                no1 = false;
            } else if (num == 4) {
                no4 = false;
            }
        }
        return no1 || no4;
    }

    /**
     * Loop on the array, keep track when a 1 or a 4 is seen, and, if the other is
     * already seen, the loop could be interrupted
     *
     * @param nums an array of int
     * @return true if no 1 or no 4 in it
     */
    public static boolean alternative(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for (int num : nums) {
            if (num == 1) {
                if (has4) {
                    return false;
                }
                has1 = true;
            } else if (num == 4) {
                if (has1) {
                    return false;
                }
                has4 = true;
            }
        }
        return true;
    }
}
