/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * fizzString - https://codingbat.com/prob/p137136
 * <p>
 * If the input string is empty or doesn't start by 'f' or end by 'b', return
 * it. Otherwise return "Fizz", if its first char is 'f', "Buzz" if ends with
 * 'b', or "FizzBuzz" if both are true
 */
public class FizzString {
    /**
     * Check the chars, then build the result string
     * 
     * @param str a possibly empty string
     * @return str, "Fizz", "Buzz", or "FizzBuzz"
     */
    public static String solution(String str) {
        if (str.isEmpty()) {
            return str;
        }

        boolean fizz = str.charAt(0) == 'f';
        boolean buzz = str.charAt(str.length() - 1) == 'b';
        if (!fizz && !buzz) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        if (fizz) {
            result.append("Fizz");
        }
        if (buzz) {
            result.append("Buzz");
        }
        return result.toString();
    }

    /**
     * Check the chars, then build the result string
     * 
     * @param str a possibly empty string
     * @return str, "Fizz", "Buzz", or "FizzBuzz"
     */
    public static String compact(String str) {
        if (str.isEmpty()) {
            return str;
        }

        String fizz = str.charAt(0) == 'f' ? "Fizz" : "";
        String buzz = str.charAt(str.length() - 1) == 'b' ? "Buzz" : "";
        if (fizz.isEmpty() && buzz.isEmpty()) {
            return str;
        }
        return fizz + buzz;
    }
}
