/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * scoresClump - https://codingbat.com/prob/p194530
 * <p>
 * Given a naturally sorted array, check if there is a triplet where its
 * leftmost and rightmost elements differ for at most 2.
 */
public class ScoresClump {
    /**
     * Check (forward) all triplets for a compliant one
     *
     * @param scores an array
     * @return true if succeeded
     */
    public static boolean solution(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check (backward) all triplets for a compliant one
     *
     * @param scores an array
     * @return true if succeeded
     */
    public static boolean alternative(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] <= 2) {
                return true;
            }
        }
        return false;
    }
}
