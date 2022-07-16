/**
 * https://codingbat.com/java/Array-2
 */
package cb;

public class Array2 {
    /**
     * codingbat.com/prob/p162010
     *
     * @param nums a possibly empty array of integers
     * @return how many even values are in nums
     */
    public static int countEvens(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * codingbat.com/prob/p127384
     *
     * @param nums a possibly empty array of integers
     * @return sum of all the elements but the 13s and the next ones
     */
    public static int sum13(int[] nums) {
        int result = 0;

        boolean skip = false;
        for (int num : nums) {
            if (num != 13 && !skip) {
                result += num;
            }
            skip = num == 13;
        }

        return result;
    }

    /**
     * codingbat.com/prob/p194525
     *
     * @param nums a possibly empty array of integers
     * @return true if nums does not contain 1 or 3
     */
    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }

        return true;
    }

    /**
     * codingbat.com/prob/p180920
     *
     * @param n a non-negative integer
     * @return an array sized n with the natural (zero-based) sequence
     */
    public static int[] fizzArray(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
    }

    /**
     * codingbat.com/prob/p136648
     *
     * @param nums an array of int
     * @return true if no 1, 4 in it
     */
    public static boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {
            if (num == 1) {
                count1 += 1;
            } else if (num == 4) {
                count4 += 1;
            }
        }
        return count1 == 0 || count4 == 0;
    }

    /**
     * codingbat.com/prob/p136254
     *
     * @param nums1 an array
     * @param nums2 another array, same size
     * @return times that the elements in the same position differ by 2 or less, but are not equal
     */
    public static int matchUp(int[] nums1, int[] nums2) {
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);
            if (difference > 0 && difference < 3) {
                result += 1;
            }
        }
        return result;
    }
}