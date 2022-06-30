/**
 * https://codingbat.com/java/Array-3
 */
package cb;

public class Array3 {
    /**
     * codingbat.com/prob/p189576
     *
     * @param nums an array of int
     * @return the max distance between elements with the same value (Efficiency not a priority)
     */
    public static int maxSpan(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            for (; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    break;
                }
            }

            result = Math.max(result, j - i + 1);
        }

        return result;
    }

    /**
     * codingbat.com/prob/p158767
     *
     * @param nums a non-empty array of int
     * @return true if it could be split in a balanced way
     */
    public static boolean canBalance(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) {
            return false;
        }

        sum /= 2;
        for (int i = 0; sum > 0; i++) {
            sum -= nums[i];
        }

        return sum == 0;
    }

    /**
     * codingbat.com/prob/p104090
     *
     * @param n a (small) int
     * @return an array for all the natural series from 1 to n
     */
    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];

        for (int i = 0, j = 0; i < n; i++) {
            for (int k = 0; k <= i; j++, k++) {
                result[j] = k + 1;
            }
        }

        return result;
    }
}
