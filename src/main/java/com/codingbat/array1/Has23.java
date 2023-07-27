/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * has23 - https://codingbat.com/prob/p171022
 * <p>
 * check if the passed array, sized 2, contains 2 or 3
 */
public class Has23 {
    /**
     * codingbat.com/prob/p171022
     * 
     * @param nums an array sized 2
     * @return true if contains 2 or 3
     */
    public static boolean solution(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }
}
