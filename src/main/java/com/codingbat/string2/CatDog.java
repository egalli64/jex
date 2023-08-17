/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * catDog - https://codingbat.com/prob/p111624
 * <p>
 * Check if the number of "cat" and "dog" in the passed string is the same
 */
public class CatDog {
    /**
     * Check all the triplets in the string, if it is a "cat" increase a counter, if
     * it is a "dog" decrease it. In the end check the counter, if zero, "cat" and
     * "dog" are in the same number
     * 
     * @param str
     * @return
     */
    public static boolean solution(String str) {
        int delta = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);

            if (first == 'c' && second == 'a' && third == 't') {
                delta += 1;
            } else if (first == 'd' && second == 'o' && third == 'g') {
                delta -= 1;
            }
        }

        return delta == 0;
    }

    /**
     * Delegate to {@linkplain CatDog#counter(String, String)} to count. Compare the
     * result for both calls.
     *
     * @param str a string
     * @return true if same number of "cat" and "dog"
     */
    public static boolean alternative(String str) {
        return counter(str, "cat") == counter(str, "dog");
    }

    /**
     * Helper for {@linkplain CatDog#solution(String)}. Use String::indexOf
     *
     * @param s      where to search
     * @param target what to search
     * @return number of targets
     */
    static int counter(String s, String target) {
        int count = 0;
        int pos = -1;
        while ((pos = s.indexOf(target, pos + 1)) != -1) {
            count += 1;
        }
        return count;
    }
}
