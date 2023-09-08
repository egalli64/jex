/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * maxBlock - https://codingbat.com/prob/p179479
 * <p>
 * Find the size of the largest "block", meaning, same char sequence.
 */
public class MaxBlock {
    /**
     * If the input string is empty, return 0. Otherwise, define a couple of
     * integers to keep track of the max and current block size, both initialized to
     * one. Loop on all chars from the second on, if the current char is the same of
     * the previous one, increase the current block size, otherwise update the max
     * block size, when required, and reset to one the current block size. After the
     * loop, return the larger between the current and the max size. This last check
     * is required in case of the largest block takes the last char.
     * 
     * @param str a string
     * @return found max block size
     */
    public static int solution(String str) {
        if (str.length() == 0) {
            return 0;
        } else {
            int maxSize = 1;
            int current = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    current += 1;
                } else {
                    maxSize = Math.max(current, maxSize);
                    current = 1;
                }
            }

            return Math.max(current, maxSize);
        }
    }

    /**
     * Initialize a local variable to keep track of the max block size, initialized
     * to zero. Loop on all chars, defining a local variable to keep the current
     * block size, initialized to one. In a nested loop, from the next char on,
     * until the end of string is reached, end the current char is same to the next
     * one, increase the external loop variable and the current block size. After
     * the end of the nested loop, check if the current block size is bigger than
     * the max block size, if so, set it to the new value.
     * 
     * @param str a string
     * @return found max block size
     */
    public static int alternative(String str) {
        int maxSize = 0;

        for (int i = 0; i < str.length(); i++) {
            int current = 1;
            for (int j = i + 1; j < str.length() && str.charAt(i) == str.charAt(j); j++) {
                i += 1;
                current += 1;
            }
            maxSize = Math.max(current, maxSize);
        }

        return maxSize;
    }
}
