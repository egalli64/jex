/**
 * https://codingbat.com/java/Recursion-2
 */
package cb;

public class Recursion2 {
    /**
     * codingbat.com/prob/p145416
     *
     * @param start  first index in the array to consider
     * @param nums   a possibly empty array
     * @param target expected sum of a sequence in the array
     * @return true if there is a sequence in the array with given target sum
     */
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        // check next, with or without picking up the current value
        int next = start + 1;
        return groupSum(next, nums, target - nums[start]) || groupSum(next, nums, target);
    }

    /**
     * codingbat.com/prob/p138907
     *
     * <p>Like {@linkplain Recursion2#groupSum(int, int[], int)}
     * but all multiple of 5 should be included, but the following 1s should be excluded
     *
     * @param start  first index in the array to consider
     * @param nums   a possibly empty array
     * @param target expected sum of a sequence in the array
     * @return true if there is a sequence in the array with given target sum
     */
    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        int next = start + 1;

        // all multiples of 5 in the array must be included in the group
        if (nums[start] % 5 == 0) {
            return groupSum5(next, nums, target - nums[start]);
        }

        // if the value immediately following a multiple of 5 is 1, it must not be chosen
        if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1) {
            return groupSum5(next, nums, target);
        }

        return groupSum5(next, nums, target - nums[start]) || groupSum5(next, nums, target);
    }

    /**
     * codingbat.com/prob/p171660
     *
     * @param nums a possibly empty array
     * @return true if it is possible to split the elements in two groups, one with sum multiple of ten, the other odd
     */
    public static boolean splitOdd10(int[] nums) {
        return so10Impl(0, nums, 0, 0);
    }

    /**
     * Helper for {@linkplain Recursion2#splitOdd10(int[])}
     *
     * @param pos  the current position
     * @param nums a possibly empty array
     * @param ten  sum of the partition that should be multiple of ten
     * @param odd  sum of the partition that should be odd
     * @return true when good partitions are found
     */
    private static boolean so10Impl(int pos, int[] nums, int ten, int odd) {
        if (pos == nums.length) {
            return ten % 10 == 0 && odd % 2 != 0;
        }

        int next = pos + 1;
        int curVal = nums[pos];
        return so10Impl(next, nums, ten + curVal, odd) || so10Impl(next, nums, ten, odd + curVal);
    }
}
