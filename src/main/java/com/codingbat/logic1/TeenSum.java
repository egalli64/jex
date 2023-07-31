/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * teenSum - https://codingbat.com/prob/p178728
 * <p>
 * The sum of the parameters or, if both are in [13..19], 19  
 */
public class TeenSum {
    /**
     * Check by {@linkplain TeenSum#isTeen(int)}
     * 
     * @param a first value
     * @param b second value
     * @return the sum, or, if a value is in [13..19] then 19
     */
    public static int solution(int a, int b) {
        return isTeen(a) || isTeen(b) ? 19 : a + b;
    }

    /**
     * Helper for {@linkplain TeenSum#solution(int, int)}
     * 
     * @param value an integer
     * @return true if in [13..19]
     */
    public static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }
}
