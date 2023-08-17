/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * fizzBuzz - https://codingbat.com/prob/p153059
 * <p>
 * Generate a string for each value in the passed interval [start, end) and push
 * it in the array that will be returned.
 * <p>
 * A multiple of 3 is associated with "Fizz", a multiple of 5 with "Buzz", if
 * both "FizzBuzz", if neither the number itself.
 */
public class FizzBuzz {
    /**
     * Create a string array of the required size, loop on it, and put in the
     * current element the right string, as described above.
     * 
     * @param start first value
     * @param end   last, not included, value
     * @return the FizzBuzz array
     */
    public static String[] solution(int start, int end) {
        String[] result = new String[end - start];

        for (int i = 0, j = start; i < result.length; i++, j++) {
            if (j % 3 != 0 && j % 5 != 0) {
                result[i] = String.valueOf(j);
            } else {
                StringBuilder cur = new StringBuilder();
                if (j % 3 == 0) {
                    cur.append("Fizz");
                }
                if (j % 5 == 0) {
                    cur.append("Buzz");
                }
                result[i] = cur.toString();
            }
        }

        return result;
    }
}
