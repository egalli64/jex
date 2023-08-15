/**
 * https://codingbat.com/java/Array-2
 */
package com.codingbat;

import java.util.Arrays;

public class Array2 {
    /**
     * codingbat.com/prob/p100246
     * 
     * @param nums non-empty with at least a 4
     * @return the array up to the first 4 in array
     */
    public static int[] pre4(int[] nums) {
        int i = 0;
        while (nums[i] != 4) {
            i += 1;
        }
        return Arrays.copyOf(nums, i);
    }

    /**
     * codingbat.com/prob/p164144
     * 
     * @param nums non-empty, with at least a 4
     * @return the array following the last 4 in the array
     */
    public static int[] post4(int[] nums) {
        int i = nums.length - 1;
        while (nums[i] != 4) {
            i -= 1;
        }
        return Arrays.copyOfRange(nums, i + 1, nums.length);
    }

    /**
     * codingbat.com/prob/p169506
     * 
     * @param nums an array
     * @param val  to be changed
     * @return changed val with the highest neighbor, when not in extreme position
     */
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    /**
     * codingbat.com/prob/p193753
     * 
     * @param nums an array
     * @return rearrange with zeroes at the beginning
     */
    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];

        int j = result.length - 1;
        for (int num : nums) {
            if (num != 0) {
                result[j] = num;
                j -= 1;
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p196976
     * 
     * @param nums an array
     * @return 10s go to 0 and to the right
     */
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 10) {
                result[j] = num;
                j += 1;
            }
        }
        return result;
    }

    /**
     * codingbat.com/prob/p187050
     * 
     * @param nums an array
     * @return zero replaced by the largest odd value to the right (if any)
     */
    public static int[] zeroMax(int[] nums) {
        int changer = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i] = changer;
            } else if (nums[i] > changer && nums[i] % 2 == 1) {
                changer = nums[i];
            }
        }

        return nums;
    }

    /**
     * codingbat.com/prob/p105771
     * 
     * @param nums an array
     * @return even numbers before odd ones
     */
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = result.length - 1;
        for (int num : nums) {
            result[num % 2 == 0 ? even++ : odd--] = num;
        }
        return result;
    }

    /**
     * codingbat.com/prob/p153059
     * 
     * @param start first value
     * @param end   last, not included, value
     * @return an array with "Fizz" as 3*x, "Buzz" as 5*x, "FizzBuzz" as 3*5*x
     */
    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = 0, j = start; j < end; i++, j++) {
            if (j % 3 != 0 && j % 5 != 0) {
                result[i] = String.valueOf(j);
                continue;
            }

            StringBuilder cur = new StringBuilder();
            if (j % 3 == 0) {
                cur.append("Fizz");
            }
            if (j % 5 == 0) {
                cur.append("Buzz");
            }
            result[i] = cur.toString();
        }
        return result;
    }
}
