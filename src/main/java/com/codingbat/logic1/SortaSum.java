/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * sortaSum - https://codingbat.com/prob/p183071
 * <p>
 * Sum the passed integers. But if the sum is in [10..19] the result is 20
 */
public class SortaSum {
    /**
     * Conditional result based on checking the interval
     * 
     * @param a first value
     * @param b second value
     * @return their (adjusted) sum
     */
    public static int solution(int a, int b) {
        int sum = a + b;
        return sum < 10 || sum > 19 ? sum : 20;
    }
}
