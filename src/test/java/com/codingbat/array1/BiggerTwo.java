/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import java.util.Arrays;

/**
 * biggerTwo - https://codingbat.com/prob/p109537
 * <p>
 * Given two int arrays size two, return the array with the biggest sum, or the
 * first one in case of tie
 */
public class BiggerTwo {
    /**
     * Sum "by hand" the elements
     * 
     * @param a first array, sized 2
     * @param b second array, sized 2
     * @return the array with highest sum, a in case of tie
     */
    public static int[] solution(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        return sumB > sumA ? b : a;
    }

    /**
     * Let the streams do the dirty job
     * 
     * @param a first array, sized 2
     * @param b second array, sized 2
     * @return the array with highest sum, a in case of tie
     */
    public static int[] streaming(int[] a, int[] b) {
        return Arrays.stream(b).sum() > Arrays.stream(a).sum() ? b : a;
    }
}
