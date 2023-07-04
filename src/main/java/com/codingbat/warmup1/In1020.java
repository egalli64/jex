/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * in1020 - codingbat.com/prob/p144535
 * <p>
 * Check if at least a parameter is in range 10..20 inclusive
 */
public class In1020 {
    /**
     * The actual job is delegated to {@linkplain In1020#isInRange(int)} 
     * 
     * @param a first value
     * @param b second value
     * @return true if either of them is in the range 10..20 inclusive
     */
    public static boolean solution(int a, int b) {
        return isInRange(a) || isInRange(b);
    }

    /**
     * Helper for {@linkplain In1020#solution(int, int)}
     * 
     * @param value a value
     * @return true if in [10..20]
     */
    static boolean isInRange(int value) {
        return value > 9 && value < 21;
    }
}
