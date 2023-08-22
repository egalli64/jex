/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * scoresIncreasing - https://codingbat.com/prob/p146974
 * <p>
 * Given an array, sized 2+, check if each element is equal or greater than the
 * previous one.
 */
public class ScoresIncreasing {
    /**
     * Check all the pairs in the array, as soon as one pair not respecting the
     * requirement is detected, return false.
     *
     * @param an array
     * @return true if accepted
     */
    public static boolean solution(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
