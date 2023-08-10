/**
 * https://codingbat.com/java/Warmup-2
 */
package com.codingbat;

public class Warmup2 {
    /**
     * codingbat.com/prob/p170221
     *
     * @param nums a possibly empty array
     * @return true if it does not contain any chained triplet
     */
    public static boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        int count = 1;
        int triplet = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == triplet) {
                count += 1;
                if (count == 3) {
                    return false;
                }
            } else {
                count = 1;
                triplet = nums[i];
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p167430
     * 
     * @param nums an array
     * @return check pattern [x, x+5, x-1 (delta 2)]
     */
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (nums[i + 1] == x + 5 && Math.abs(nums[i + 2] - (x - 1)) < 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p110019
     * 
     * @param nums an array
     * @return count couples of 6 and 6 or 7
     */
    public static int array667(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result += 1;
            }
        }

        return result;
    }
}
