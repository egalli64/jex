/**
 * https://codingbat.com/java/Array-2
 */
package com.codingbat;

public class Array2 {
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
