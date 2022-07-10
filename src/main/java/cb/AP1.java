/**
 * https://codingbat.com/java/AP-1
 */
package cb;

import java.util.ArrayList;
import java.util.List;

public class AP1 {
    /**
     * codingbat.com/prob/p146974
     *
     * @param scores a sequence of int with at least two values
     * @return true if the sequence is not decreasing
     */
    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p123837
     *
     * @param scores an int array sized two or more
     * @return the biggest _int_ average between left/right side of the array
     */
    public static int scoresAverage(int[] scores) {
        int center = scores.length / 2;
        int left = average(scores, 0, center);
        int right = average(scores, center, scores.length);
        return Math.max(left, right);
    }

    /**
     * Helper for {@linkplain AP1#scoresAverage(int[])}
     *
     * @param scores a non-empty array
     * @param start  begin index
     * @param end    first out of bound index
     * @return the _int_ average for the specified elements
     */
    private static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    /**
     * codingbat.com/prob/p183407
     *
     * @param words a string array
     * @param len   the forbidden length
     * @return the strings in input not having the forbidden length
     */
    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }

    /**
     * codingbat.com/prob/p179487
     *
     * @param scores an array sized 2+
     * @return if there is at least a couple of 100 next to each other
     */
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p124620
     *
     * @param words an array
     * @param len   a string length
     * @return how may string of the given length are in the input array
     */
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * codingbat.com/prob/p191212
     *
     * @param n a positive number
     * @return true if it contains the cipher 1
     */
    public static boolean hasOne(int n) {
        for (; n > 0; n /= 10) {
            if (n % 10 == 1) {
                return true;
            }
        }
        return false;
    }
}
