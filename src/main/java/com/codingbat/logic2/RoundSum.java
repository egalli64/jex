/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * roundSum - https://codingbat.com/prob/p186753
 * <p>
 * Add up all the values passed, but rounding them to tens (with 4 leading to 0,
 * and 5 leading to 10)
 */
public class RoundSum {
    /**
     * Delegate the rounding to {@linkplain RoundSum#round10(int)}, the add them up
     * 
     * @param a a value
     * @param b a value
     * @param c a value
     * @return sum each value rounded to multiple of 10
     */
    public static int solution(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    /**
     * Helper for {@linkplain RoundSum#solution(int, int, int)}
     * <p>
     * Extract the last decimal digit for the passed value, use it to decide to go
     * up or down
     * 
     * @param num a value
     * @return the value rounded to multiple of 10
     */
    static int round10(int num) {
        int last = num % 10;
        return last < 5 ? num - last : num + 10 - last;
    }
}
