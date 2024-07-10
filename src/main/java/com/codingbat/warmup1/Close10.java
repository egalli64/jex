/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/

  close10 - codingbat.com/prob/p172021
 */
package com.codingbat.warmup1;

/**
 * Given two integers return the nearest to 10, or 0 in case of tie
 */
public class Close10 {
    /**
     * Use Math.abs() to get the distance of a and b from 10, then compare them
     * 
     * @param a first value
     * @param b second value
     * @return the nearest to 10, or 0
     */
    public static int solution(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);

        if (distA == distB) {
            return 0;
        }
        return distA < distB ? a : b;
    }

    /**
     * Using more than a ternary operator in a single statement, even if the
     * resulting code is more compact, it is often considered a bad idea
     * 
     * @param a first value
     * @param b second value
     * @return the nearest to 10, or 0
     */
    public static int lessReadableSolution(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);

        return distA == distB ? 0 : distA < distB ? a : b;
    }
}
