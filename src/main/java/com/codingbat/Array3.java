/**
 * https://codingbat.com/java/Array-3
 */
package com.codingbat;

public class Array3 {
    /**
     * codingbat.com/prob/p193817
     *
     * @param nums an array
     * @return number of groups (2+) of same values
     */
    public static int countClumps(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counter += 1;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i += 1;
                }
            }
        }

        return counter;
    }
}
