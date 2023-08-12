/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * fizzArray2 - https://codingbat.com/prob/p178353
 * <p>
 * Check if the passed arrays contains just 1s and 4s
 */
public class FizzArray2 {

    /**
     * Create an array sized n, fill it with strings and return it
     * 
     * @param n non-negative
     * @return the strings from zero up to n (excluded)
     */
    public static String[] solution(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }
}
