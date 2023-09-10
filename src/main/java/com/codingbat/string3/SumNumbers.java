/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * sumNumbers - https://codingbat.com/prob/p121193
 * <p>
 * Find in the passed string all substrings representing an integer, and add
 * them up.
 */
public class SumNumbers {
    /**
     * Loop on all chars in the string. If a char is a digit, loop until the end of
     * the digit sequence, then extract the substring for that sequence, parse the
     * integer and add it to the accumulator that is going to be returned.
     * 
     * @param str a string
     * @return sum of integers (sequence of digit) in the string
     */
    public static int solution(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int begin = i;
                i += 1;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    i += 1;
                }

                String number = str.substring(begin, i);
                result += Integer.parseInt(number);
            }
        }

        return result;
    }

    /**
     * Loop on all chars in the input string, when a digit is found, convert it to
     * integer. Loop (nested) until the follower char is a digit and: multiply the
     * integer by 10, add to it the current digit (as integer). When the current
     * sequence of digit is completed, add the generated integer to the accumulator
     * that is going to be returned.
     * 
     * @param str a string
     * @return sum of integers (sequence of digit) in the string
     */
    public static int alternative(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            int number = Character.isDigit(cur) ? cur - '0' : 0;
            while (++i < str.length() && Character.isDigit(cur = str.charAt(i))) {
                number *= 10;
                number += cur - '0';
            }
            result += number;
        }

        return result;
    }
}
