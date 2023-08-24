/**
 * https://codingbat.com/java/AP-1
 */
package com.codingbat;

import java.util.Arrays;

public class AP1 {
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

    /**
     * codingbat.com/prob/p165941
     *
     * @param n positive, non-zero
     * @return true if each digit is a divisor of n
     */
    public static boolean dividesSelf(int n) {
        int partial = n;
        while (partial > 0) {
            int digit = partial % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            partial /= 10;
        }
        return true;
    }

    /**
     * codingbat.com/prob/p134174
     *
     * @param nums  an array size count+, with at least count even integers
     * @param count non-negative
     * @return the first count non-negative values in input
     */
    public static int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];

        for (int i = 0, j = 0; j < count; i++) {
            if (nums[i] % 2 == 0) {
                result[j++] = nums[i];
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p130124
     *
     * @param nums  an array with at least count "endy" values
     * @param count non-negative
     * @return the first count "endy", in range [0..10] or [90..100], elements from
     *         input
     */
    public static int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];

        for (int i = 0, j = 0; j < count; i++) {
            if (isEndy(nums[i])) {
                result[j++] = nums[i];
            }
        }

        return result;
    }

    /**
     * Helper for {@linkplain AP1#copyEndy(int[], int)}
     *
     * @param value a value
     * @return true if in [0..10] or [90..100]
     */
    private static boolean isEndy(int value) {
        return value >= 0 && value <= 10 || value >= 90 && value <= 100;
    }

    /**
     * codingbat.com/prob/p139677
     *
     * @param a an array of possibly empty strings
     * @param b another array, same size
     * @return how many strings in the same position starts with the same letter
     */
    public static int matchUp(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count += 1;
            }
        }

        return count;
    }

    /**
     * codingbat.com/prob/p180365
     *
     * @param key     right answers, not empty
     * @param answers actual answers, same size
     * @return score, +4 correct, -1 wrong, 0 skip "?"
     */
    public static int scoreUp(String[] key, String[] answers) {
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
     * codingbat.com/prob/p121236
     *
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] wordsWithout(String[] words, String target) {
        return Arrays.stream(words).filter(x -> !x.equals(target)).toArray(String[]::new);
    }

    /**
     * A classic alternative to {@linkplain AP1#wordsWithout(String[], String)}
     *
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] wordsWithoutClassic(String[] words, String target) {
        String[] result = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[count++] = word;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * codingbat.com/prob/p140485
     *
     * @param a non-negatives
     * @param b non-negatives
     * @return the sum of largest 10x value in both array (or zero)
     */
    public static int scoresSpecial(int[] a, int[] b) {
        int result = 0;
        result += largestSpecialScore(a);
        result += largestSpecialScore(b);
        return result;
    }

    /**
     * Helper for {@linkplain AP1#scoresSpecial(int[], int[])}
     *
     * @param values an array
     * @return the largest 10x value in it, or zero
     */
    private static int largestSpecialScore(int[] values) {
        return Arrays.stream(values).filter(x -> x % 10 == 0).max().orElse(0);
    }

    /**
     * codingbat.com/prob/p148138
     *
     * @param heights an array
     * @param start   good index, first of sub
     * @param end     good index, last of sub
     * @return sum of deltas in subs
     */
    public static int sumHeights(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start + 1; i <= end; i++) {
            result += Math.abs(heights[i] - heights[i - 1]);
        }

        return result;
    }

    /**
     * codingbat.com/prob/p157900
     *
     * @param heights an array
     * @param start   good index, first of sub
     * @param end     good index, last of sub
     * @return sum of deltas in subs, positive gaps count x2
     */
    public static int sumHeights2(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start + 1; i <= end; i++) {
            int gap = heights[i] - heights[i - 1];
            result += gap < 0 ? -gap : 2 * gap;
        }

        return result;
    }

    /**
     * codingbat.com/prob/p197710
     *
     * @param heights an array
     * @param start   good index, first of sub
     * @param end     good index, last of sub
     * @return number of 5+ steps in range
     */
    public static int bigHeights(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start + 1; i <= end; i++) {
            if (Math.abs(heights[i] - heights[i - 1]) > 4) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p143482
     *
     * @param aName first name
     * @param aId   first id
     * @param bName second name
     * @param bId   second id
     * @return -1, 0, 1, comparing name and id
     */
    public static int userCompare(String aName, int aId, String bName, int bId) {
        int name = aName.compareTo(bName);
        if (name != 0) {
            return name < 0 ? -1 : 1;
        }
        if (aId != bId) {
            return aId < bId ? -1 : 1;
        }
        return 0;
    }

    /**
     * codingbat.com/prob/p139150
     *
     * @param a sorted array, no duplicates, sized n+
     * @param b sorted array, no duplicates, sized n+
     * @param n positive
     * @return n items from the input arrays, keeping the order, no duplicates!
     */
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];

        for (int i = 0, j = 0, k = 0; i < n; i++) {
            if (a[j].equals(b[k])) {
                result[i] = a[j++];
                k++;
            } else {
                result[i] = (a[j].compareTo(b[k]) < 0) ? a[j++] : b[k++];
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p100369
     *
     * @param a ordered array, possibly with duplicates
     * @param b ordered array, possibly with duplicates
     * @return count of strings in both array (do not care about duplicates!)
     */
    public static int commonTwo(String[] a, String[] b) {
        int result = 0;

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j])) {
                String cur = a[i];
                while (i < a.length && a[i].equals(cur)) {
                    i++;
                }
                while (j < b.length && b[j].equals(cur)) {
                    j++;
                }
                result += 1;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
