/**
 * https://codingbat.com/java/Array-1
 */
package com.codingbat;

import java.util.Arrays;

public class Array1 {
    /**
     * codingbat.com/prob/p199519
     * 
     * @param nums an array of ints of even length, at least 2
     * @return a new array containing only the middle two elements
     */
    public static int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle] };
    }

    /**
     * codingbat.com/prob/p155713
     * 
     * @param nums an array of ints of odd length, at least 3
     * @return a new array containing only the middle three elements
     */
    public static int[] midThree(int[] nums) {
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
    }

    /**
     * codingbat.com/prob/p197308
     * 
     * @param nums an array
     * @return true if 1 followed by 3 in the first / last two position
     */
    public static boolean unlucky1(int[] nums) {
        if (nums.length > 1 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }

        final int last = nums.length - 1;
        return nums.length > 2 && (nums[1] == 1 && nums[2] == 3 || nums[last - 1] == 1 && nums[last] == 3);
    }

    /**
     * codingbat.com/prob/p109660
     * 
     * @param a an array, possibly empty
     * @param b another array, possibly empty
     * @return how many arrays have 1 in first position
     */
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count += 1;
        }
        if (b.length > 0 && b[0] == 1) {
            count += 1;
        }
        return count;
    }

    /**
     * codingbat.com/prob/p109537
     * 
     * @param a first array, sized 2
     * @param b second array, sized 2
     * @return the array with highest sum, a in case of tie
     */
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        return sumB > sumA ? b : a;
    }

    /**
     * codingbat.com/prob/p180840
     * 
     * @param a an array sized 2
     * @param b another array sized 2
     * @return the concatenation of the two arrays
     */
    public static int[] plusTwo(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }

    /**
     * codingbat.com/prob/p118044
     * 
     * @param nums a non-empty array
     * @return first swapped with last
     */
    public static int[] swapEnds(int[] nums) {
        int buffer = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = buffer;
        return nums;
    }

    /**
     * codingbat.com/prob/p185176
     * 
     * @param nums an array of odd size, 1+
     * @return the largest element among first, central, last
     */
    public static int maxTriple(int[] nums) {
        return Math.max(Math.max(nums[0], nums[nums.length - 1]), nums[nums.length / 2]);
    }

    /**
     * codingbat.com/prob/p142455
     * 
     * @param nums a possibly empty array
     * @return the first two elements (or less)
     */
    public static int[] frontPiece(int[] nums) {
        return Arrays.copyOf(nums, Math.min(nums.length, 2));
    }

    /**
     * codingbat.com/prob/p143461
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return a size 2 array from the concatenation of the input
     */
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];

        int lenA = Math.min(2, a.length);
        System.arraycopy(a, 0, result, 0, lenA);

        for (int i = lenA, j = 0; i < 2; i++, j++) {
            result[i] = b[j];
        }

        return result;
    }

    /**
     * codingbat.com/prob/p128270
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return the first elements of the arrays (when available)
     */
    public static int[] front11(int[] a, int[] b) {
        boolean aGood = a.length > 0;
        boolean bGood = b.length > 0;
        int[] result = new int[(aGood ? 1 : 0) + (bGood ? 1 : 0)];

        if (aGood) {
            result[0] = a[0];
        }
        if (bGood) {
            result[aGood ? 1 : 0] = b[0];
        }

        return result;
    }
}
