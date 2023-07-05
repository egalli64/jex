/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * max1020 - codingbat.com/prob/p177372
 * <p>
 * Get the larger in [10..20]
 */
public class Max1020 {
    /**
     * Ensure, by swap, that a is not less than b. Then return the first in range,
     * or zero.
     * 
     * See also {@linkplain Max1020#in1020(int)}
     * 
     * @param a first positive value
     * @param b second positive value
     * @return the larger in [10..20] or 0
     */
    public static int solution(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (in1020(a)) {
            return a;
        }
        if (in1020(b)) {
            return b;
        }
        return 0;
    }

    /**
     * Helper for {@linkplain Warmup1#max1020(int, int)}
     * 
     * @param value a value
     * @return true if in [10..20]
     */
    static boolean in1020(int value) {
        return value >= 10 && value <= 20;
    }
}
