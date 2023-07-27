/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * fix23 - https://codingbat.com/prob/p120347
 * <p>
 * If the passed array, sized 3, contains a 2 followed by a 3, set the element
 * containing 3 to zero. Notice that, given the structure of the problem, only
 * one substitution is possible.
 */
public class Fix23 {
    /**
     * Check each element in the array (but the last) for two, then the next one
     *
     * @param nums an array sized 3
     * @return the (changed) input array
     */
    public static int[] solution(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;
    }

    /**
     * Check each element (but the first) for three, then the previous one
     *
     * @param nums an array sized 3
     * @return the (changed) input array
     */
    public static int[] solution3(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i - 1] == 2) {
                nums[i] = 0;
                break;
            }
        }
        return nums;
    }
}
