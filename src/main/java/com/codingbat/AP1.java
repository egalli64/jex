/**
 * https://codingbat.com/java/AP-1
 */
package com.codingbat;

public class AP1 {
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
