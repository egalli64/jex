/**
 * https://codingbat.com/java/Array-2
 */
package com.codingbat;

public class Array2 {
    /**
     * codingbat.com/prob/p153059
     * 
     * @param start first value
     * @param end   last, not included, value
     * @return an array with "Fizz" as 3*x, "Buzz" as 5*x, "FizzBuzz" as 3*5*x
     */
    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = 0, j = start; j < end; i++, j++) {
            if (j % 3 != 0 && j % 5 != 0) {
                result[i] = String.valueOf(j);
                continue;
            }

            StringBuilder cur = new StringBuilder();
            if (j % 3 == 0) {
                cur.append("Fizz");
            }
            if (j % 5 == 0) {
                cur.append("Buzz");
            }
            result[i] = cur.toString();
        }
        return result;
    }
}
