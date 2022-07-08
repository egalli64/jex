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

    /**
     * codingbat.com/prob/p159339
     *
     * @param nums contains the same number of 3 and 4
     * @return 3 are in fixed position, 4 should follow
     */
    public static int[] fix34(int[] nums) {
        int fourPos = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                i += 1;
                for (int j = fourPos + 1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = nums[i];
                        nums[i] = 4;
                        fourPos = j;
                        break;
                    }
                }
            }
        }

        return nums;
    }

    /**
     * codingbat.com/prob/p134022
     *
     * @param outer a "container" sorted array
     * @param inner a "contained" sorted array
     * @return true if inner is actually in outer
     */
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        for (int j = 0; i < inner.length && j < outer.length; ) {
            if (inner[i] > outer[j]) {
                j += 1;
            } else if (inner[i] != outer[j]) {
                return false;
            } else {
                i += 1;
            }
        }
        return i == inner.length;
    }

    /**
     * codingbat.com/prob/p196409
     *
     * @param nums an array
     * @return max count of "mirrored" elements
     */
    public static int maxMirror(int[] nums) {
        int result = 0;

        for (int left = 0; left < nums.length; left++) {
            for (int right = nums.length - 1; right > -1; right--) {
                int current = 0;

                for (int i = left, j = right; i < nums.length && j > -1 && nums[i] == nums[j]; i++, j--) {
                    current += 1;
                }

                result = Math.max(result, current);
            }
        }

        return result;
    }
}
