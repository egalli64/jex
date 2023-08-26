/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.HashSet;
import java.util.Set;

/**
 * commonTwo - https://codingbat.com/prob/p100369
 * <p>
 * Given two sorted arrays, possibly with duplicates, count of strings that are
 * in both array - do not care about duplicates!
 */
public class CommonTwo {
    /**
     * Loop on both arrays, using i for a and j for b. When equals, discard other
     * copies (if any), and increase the counter. Otherwise, discard the "smaller"
     * one.
     *
     * @param a an ordered array
     * @param b another ordered array
     * @return counter
     */
    public static int solution(String[] a, String[] b) {
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

    /**
     * Push the strings in two sets. Intersect the two set by Set::retainAll.
     * 
     * @param a an ordered array
     * @param b another ordered array
     * @return counter
     */
    public static int intersection(String[] a, String[] b) {
        Set<String> sa = new HashSet<>();
        for (String s : a) {
            sa.add(s);
        }

        Set<String> sb = new HashSet<>();
        for (String s : b) {
            sb.add(s);
        }

        sa.retainAll(sb);
        return sa.size();
    }
}
