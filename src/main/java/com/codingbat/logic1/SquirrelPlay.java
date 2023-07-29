/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * squirrelPlay - https://codingbat.com/prob/p141061
 * <p>
 * check if the passed Fahrenheit temperature is in a range determined by the
 * flag isSummer:
 * <li>if false: [60..90]
 * <li>if true: [60..100]
 */
public class SquirrelPlay {
    /**
     * The upper bound changes accordingly to the boolean flag
     * 
     * @param temp     the current Fahrenheit temperature
     * @param isSummer summer flag
     * @return true if temperature is the expected range
     */
    public static boolean solution(int temp, boolean isSummer) {
        return temp >= 60 && temp <= 90 + (isSummer ? 10 : 0);
    }
}
