/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * stringE - codingbat.com/prob/p173784
 * <p>
 * Check if the passed string contains [1..3] 'e'
 */
public class StringE {
    /**
     * Loop on all char to count the 'e', then check the count value
     * 
     * @param str a string
     * @return true if it contains [1..3] 'e'
     */
    public static boolean solution(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count += 1;
            }
        }
        return count >= 1 && count <= 3;
    }
}
