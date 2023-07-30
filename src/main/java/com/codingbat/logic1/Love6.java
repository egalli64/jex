/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * love6 - https://codingbat.com/prob/p137742
 * <p>
 * Check if either argument is a 6, their sum is 6, or their difference is 6
 */
public class Love6 {
    /**
     * Just check the conditions. Math::abs() helps to keep the code simple
     *
     * @param a first value
     * @param b second value
     * @return true if six is in some way related with input
     */
    public static boolean solution(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
}
