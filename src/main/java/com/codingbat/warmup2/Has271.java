/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * has271 - https://codingbat.com/prob/p167430
 * <p>
 * check if the input array has a triplet of elements following this pattern:
 * <li>Second equals first plus five
 * <li>Third equals first minus one -/+2, or in [First - 3, First + 1]
 */
public class Has271 {
    /**
     * Loop on all the triples, check the pattern
     * 
     * @param nums an array
     * @return true if there is at least a triplet respecting the pattern
     */
    public static boolean solution(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && isGoodThird(nums[i], nums[i + 2])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if third is in range [first - 3, first + 1].
     * 
     * @param first first value in the triplet
     * @param third third value in the triplet
     * @return true if the pattern is respected
     */
    static boolean isGoodThird(int first, int third) {
        return third >= first - 3 && third <= first + 1;
    }
}
