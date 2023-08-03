/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * bunnyEars - https://codingbat.com/prob/p183649
 * <p>
 * Calculate recursively the number of bunny ears given the number of bunnies
 */
public class BunnyEars {
    /**
     * Base case: No bunny, no ears (no need to check for negatives).
     * <p>
     * Recursive call: return the sum of 2 and the number of ears for n-1 bunnies
     *
     * @param bunnies non-negative
     * @return number of ears, no loop or multiplication allowed
     */
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }
}
