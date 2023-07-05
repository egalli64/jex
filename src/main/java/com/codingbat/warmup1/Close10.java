/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * close10 - codingbat.com/prob/p172021
 * <p>
 * The nearest to ten
 */
public class Close10 {
    /**
     * codingbat.com/prob/p172021
     * 
     * @param a first value
     * @param b second value
     * @return the nearest to 10, or 0 for a tie
     */
    public static int solution(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);

        if (distA == distB) {
            return 0;
        }
        return distA < distB ? a : b;
    }
}
