/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * icyHot - codingbat.com/prob/p192082
 * <p>
 * Check if one temperature is less than 0 and the other is greater than 100
 */
public class IcyHot {
    /**
     * Check the couples in the two possible ways
     * 
     * @param temp1 first temperature
     * @param temp2 second temperature
     * @return true if one is less than 0 and the other is greater than 100
     */
    public static boolean solution(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }
}
