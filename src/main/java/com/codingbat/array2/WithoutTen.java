/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * withoutTen - https://codingbat.com/prob/p196976
 * <p>
 * Return an array (or the same array modified in-place) where the 10 values are
 * replaced with 0 and moved at the bottom. The non-10 elements must keep their
 * relative order.
 */
public class WithoutTen {
    /**
     * Create a new array, same size of the passed one, copy its non-10 elements to
     * it, each 10 is going to become automatically a 0 to the right
     * 
     * @param nums an array
     * @return a 10-free array
     */
    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num != 10) {
                result[i] = num;
                i += 1;
            }
        }
        return result;
    }

    /**
     * In-place version, based on bubble sort idea. The rightmost element should be
     * converted "by hand" to 0, when required
     * 
     * @param nums an array
     * @return a 10-free array
     */
    public static int[] inPlaceBubble(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] == 0 || nums[i] == 10) {
                    nums[i] = nums[i + 1] == 10 ? 0 : nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
        }

        if (nums.length > 0 && nums[nums.length - 1] == 10) {
            nums[nums.length - 1] = 0;
        }

        return nums;
    }

    /**
     * In-place version, based on selection sort idea. The rightmost element should
     * be converted "by hand" to 0, when required
     * 
     * @param nums an array
     * @return a 10-free array
     */
    public static int[] inPlaceSelection(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && (nums[j - 1] == 0 || nums[j - 1] == 10); j--) {
                nums[j - 1] = nums[j] == 10 ? 0 : nums[j];
                nums[j] = 0;
            }
        }

        if (nums.length > 0 && nums[nums.length - 1] == 10) {
            nums[nums.length - 1] = 0;
        }

        return nums;
    }
}
