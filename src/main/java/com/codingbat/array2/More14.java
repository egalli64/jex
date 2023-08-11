/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * more14 - https://codingbat.com/prob/p104627
 * <p>
 * Check if there are more 1 than 4 in the passed array
 */
public class More14 {
    /**
     * Loop on the array, increase delta for each 1, decrease it for each 4. Return
     * true is delta is 1 or more.
     * 
     * @param nums an array
     * @return are 1s more than 4s?
     */
    public static boolean solution(int[] nums) {
        int delta = 0;

        for (int num : nums) {
            if (num == 1) {
                delta += 1;
            } else if (num == 4) {
                delta -= 1;
            }
        }

        return delta > 0;
    }
}
