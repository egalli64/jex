/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * scores100 - https://codingbat.com/prob/p179487
 * <p>
 * Given an array, sized 2+, check if there is at least a couple of 100
 * elements, next to each other.
 */
public class Scores100 {
    /**
     * Check all the pairs looking for a (100, 100) case.
     *
     * @param scores an array
     * @return true for success
     */
    public static boolean solution(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }
}
