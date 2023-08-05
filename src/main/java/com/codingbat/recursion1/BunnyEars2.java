/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * bunnyEars2 - https://codingbat.com/prob/p107330
 * <p>
 * Calculate recursively the number of ears for the passed number of bunnies.
 * Odd bunnies have two ears, even bunnies have three ears.
 */
public class BunnyEars2 {
    /**
     * Base case: no bunny, no ears (no need to check for negatives)
     * <p>
     * Recursive call: The number of ears for the current bunny (2 or 3, accordingly
     * to the bunny module) added to a recursive call for one bunny less
     *
     * @param bunnies the non-negative number of bunnies
     * @return the bunny ear count
     */
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        int count = bunnies % 2 == 0 ? 3 : 2;
        return count + bunnyEars2(bunnies - 1);
    }
}
