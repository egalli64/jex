/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.stream.IntStream;

/**
 * scoreUp - https://codingbat.com/prob/p180365
 * <p>
 * Compare each key with the answer with the same index. Each match is +4,
 * mismatch is -1, no answer ("?") is zero.
 */
public class ScoreUp {
    /**
     * Loop on both arrays, comparing each key and answer
     *
     * @param key     solutions
     * @param answers actual answers, same size
     * @return the total score
     */
    public static int solution(String[] key, String[] answers) {
        int result = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals(key[i])) {
                result += 4;
            } else if (!answers[i].equals("?")) {
                result -= 1;
            }
        }

        return result;
    }

    /**
     * On an int stream representing all the indices for the two arrays (assume same
     * size), map to a stream of evaluations, then sum them up.
     * 
     * @param key     solutions
     * @param answers actual answers, same size
     * @return the total score
     */
    public static int modern(String[] key, String[] answers) {
        return (int) IntStream.range(0, key.length).map(i -> {
            if (answers[i].equals(key[i])) {
                return 4;
            } else if (!answers[i].equals("?")) {
                return -1;
            } else {
                return 0;
            }
        }).sum();
    }
}
