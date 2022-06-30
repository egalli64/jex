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
        for(int num : nums) {
            if(num == 1 || num == 3) {
                return false;
            }
        }

        return true;
    }
}
