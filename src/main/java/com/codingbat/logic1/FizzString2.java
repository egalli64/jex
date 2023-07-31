/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * fizzString2 - https://codingbat.com/prob/p115243
 * <p>
 * Check the input number. Return a string accordingly to its value:
 * <li>"Fizz!" if it is a 3 multiple
 * <li>"Buzz!" if it is a 5 multiple
 * <li>"FizzBuzz!" if it is both 3 and 5 multiple
 * <li>the input number concatenated with '!' otherwise
 */
public class FizzString2 {
    /**
     * Build the resulting string piece by piece
     * 
     * @param n an integer
     * @return "Fizz!", "Buzz!", "FizzBuzz!", or n concatenated to "!"
     */
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();

        boolean fizzOrBuzz = false;
        if (n % 3 == 0) {
            fizzOrBuzz = true;
            result.append("Fizz");
        }
        if (n % 5 == 0) {
            fizzOrBuzz = true;
            result.append("Buzz");
        }
        if (!fizzOrBuzz) {
            result.append(n);
        }

        result.append('!');
        return result.toString();
    }
}
