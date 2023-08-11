/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * sum67 - https://codingbat.com/prob/p111327
 * <p>
 * Sum up all the elements in the passed array, ignoring the ones in intervals
 * delimited by 6 on the left and 7 on the right
 */
public class Sum67 {
    /**
     * Loop on all the elements, add up only the ones not in ignored intervals
     * 
     * @param nums an array
     * @return sum of not ignored elements
     */
    public static int solution(int[] nums) {
        int result = 0;

        boolean ignored = false;
        for (int num : nums) {
            if (num == 6) {
                ignored = true;
            }
            if (!ignored) {
                result += num;
            }
            if (num == 7) {
                ignored = false;
            }
        }

        return result;
    }
}
