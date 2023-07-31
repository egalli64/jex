/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * twoAsOne - https://codingbat.com/prob/p113261
 * <p>
 * Check if one (whichever) of the three parameters is the sum of the other two
 * ones
 */
public class TwoAsOne {
    /**
     * Just try all the possible combinations
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if a value is the sum of the other two ones
     */
    public static boolean solution(int a, int b, int c) {
        return a == b + c || b == a + c || c == a + b;
    }
}
