/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * dateFashion - https://codingbat.com/prob/p103360
 * <p>
 * Check the two input integers, that are expected to be in [0..10]. Return
 * <li>0: if at least a value is 2 or less
 * <li>2: if no 2 or less, and at least a value is 8 or more
 * <li>1: all the other cases
 */
public class DateFashion {
    /**
     * Check the values in the right order
     * 
     * @param you  a value in [0..10]
     * @param date a value in [0..10]
     * @return a value in [0..2]
     */
    public static int solution(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }
}
