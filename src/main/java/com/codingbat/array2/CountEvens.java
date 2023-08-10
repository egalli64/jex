/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * countEvens - https://codingbat.com/prob/p162010
 * <p>
 * Count the even elements in the passed array
 */
public class CountEvens {
    /**
     * Loop on all the elements, increase the result for each even number detected
     *
     * @param nums a possibly empty array of integers
     * @return how many even values are in nums
     */
    public static int solution(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result += 1;
            }
        }

        return result;
    }
}
