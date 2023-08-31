/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * linearIn - https://codingbat.com/prob/p134022
 * <p>
 * Given two sorted arrays, outer and inner, check if all the elements in inner
 * are also in outer.
 */
public class LinearIn {
    /**
     * Loop while is not reached the end of either array. Notice that the current
     * inner element shouldn't be smaller than the matching outer elements. If an
     * inner/outer element match is found, pass to the next inner element. Exiting
     * the loop means success only if all the inner elements have been matched.
     *
     * @param outer a "container" sorted array
     * @param inner a "contained" sorted array
     * @return true if inner is in outer
     */
    public static boolean solution(int[] outer, int[] inner) {
        int i = 0;
        for (int j = 0; j < outer.length && i < inner.length; j++) {
            if (inner[i] < outer[j]) {
                return false;
            } else if (inner[i] == outer[j]) {
                i++;
            }
        }
        return i == inner.length;
    }
}
