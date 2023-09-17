/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * triangle - https://codingbat.com/prob/p194781
 * <p>
 * Calculate recursively the number of blocks in a triangle given the numbers of
 * its rows. The topmost row has a single block, the second two, the third
 * three. The resulting succession is:
 * 
 * <pre>
 * 0, 1, 2, 3,  4,  5, ...
 * 0, 1, 3, 6, 10, 15, ...
 * </pre>
 */
public class Triangle {
    /**
     * Base cases: no row, no blocks. One row, one block.
     * <p>
     * Recursive call: The number of rows added to the result of a call for one row
     * less
     *
     *
     * @param rows non-negative
     * @return the number of block
     */
    public static int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        }

        return rows + triangle(rows - 1);
    }
}
