/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * in3050 - codingbat.com/prob/p132134
 * <p>
 * Check if both parameters are in [30..40] or in [40..50]
 */
public class In3050 {
    /**
     * Delegate checks to {@linkplain In3050#in3040(int)} and
     * {@linkplain In3050#in4050(int)}
     * 
     * @param a first value
     * @param b second value
     * @return true if they are both in [30..40] or [40..50]
     */
    public static boolean solution(int a, int b) {
        return in3040(a) && in3040(b) || in4050(a) && in4050(b);
    }

    /**
     * Helper for {@linkplain In3050#solution(int, int)}
     * 
     * @param value a value
     * @return true if in [30..40]
     */
    static boolean in3040(int value) {
        return value >= 30 && value <= 40;
    }

    /**
     * Helper for {@linkplain In3050#solution(int, int)}
     * 
     * @param value a value
     * @return true if in [40..50]
     */
    static boolean in4050(int value) {
        return value >= 40 && value <= 50;
    }
}
