/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * evenOdd - https://codingbat.com/prob/p105771
 * <p>
 * Rearrange the elements in the passed array, so that even numbers are before
 * odd ones. No need to keep the relative order. The job could be done in-place
 * or on a copy of the passed array.
 */
public class EvenOdd {
    /**
     * Create a new array with the same size of the original one. Loop on the input
     * array, copy the even elements on the left and the odd ones on the right.
     * 
     * @param nums an array
     * @return the rearranged array copy
     */
    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = result.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[even] = num;
                even += 1;
            } else {
                result[odd] = num;
                odd -= 1;
            }
        }
        return result;
    }

    /**
     * Create a new array with the same size of the original one. Loop on the input
     * array, copy the even elements on the left and the odd ones on the right.
     * <p>
     * The ternary operator makes the code more compact but (probably) less
     * readable.
     * 
     * @param nums an array
     * @return the rearranged array copy
     */
    public static int[] compact(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = result.length - 1;
        for (int num : nums) {
            result[num % 2 == 0 ? even++ : odd--] = num;
        }
        return result;
    }

    public static int[] inPlace(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 1;
                j -= 1;
            } else {
                if (nums[i] % 2 == 0) {
                    i += 1;
                }
                if (nums[j] % 2 != 0) {
                    j -= 1;
                }
            }
        }

        return nums;
    }
}
