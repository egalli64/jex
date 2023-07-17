/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * maxEnd3 - https://codingbat.com/prob/p146256
 * <p>
 * Change all the elements in the passed array - assumed it sized 3 - to the
 * largest value between the first and the last one
 */
public class MaxEnd3 {
    /**
     * codingbat.com/prob/p146256
     * 
     * @param nums an array sized 3
     * @return all set as the max value between first and last
     */
    public static int[] solution(int[] nums) {
        int value = Math.max(nums[0], nums[nums.length - 1]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
        }
        return nums;
    }
}
