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

    /**
     * codingbat.com/prob/p199368
     *
     * @param start  first index to consider
     * @param nums   array
     * @param target summing up elements
     * @return true if target could be reach, all 6 in array must be used!
     */
    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        if (target < 0) {
            return false;
        }

        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        } else {
            if (nums[start] == 6) {
                return false;
            }
            return groupSum6(start + 1, nums, target);
        }
    }

    /**
     * codingbat.com/prob/p169605
     *
     * @param start  first element to consider
     * @param nums   array
     * @param target the required total
     * @return true if target could be reached without using adjacent element in the array
     */
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        return groupNoAdj(start, nums, target, true);
    }

    /**
     * Helper for {@linkplain Recursion2#groupNoAdj(int, int[], int)}
     *
     * @param start      first element to consider
     * @param nums       array
     * @param target     the required total
     * @param selectable true if the current element could be considered
     * @return true if target could be reached
     */
    private static boolean groupNoAdj(int start, int[] nums, int target, boolean selectable) {
        if (start == nums.length) {
            return target == 0;
        }
        if (target < 0) {
            return false;
        }

        if (selectable && groupNoAdj(start + 1, nums, target - nums[start], false)) {
            return true;
        } else {
            return groupNoAdj(start + 1, nums, target, true);
        }
    }

    /**
     * codingbat.com/prob/p105136
     *
     * @param start  first element to consider
     * @param nums   array
     * @param target the required total
     * @return true if target could be reached (with groups of equal values)
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        if (target < 0) {
            return false;
        }

        int size = 1;
        while (start + size < nums.length && nums[start] == nums[start + size]) {
            size += 1;
        }

        int value = nums[start] * size;
        int next = start + size;

        return groupSumClump(next, nums, target - value) || groupSumClump(next, nums, target);
    }

    /**
     * codingbat.com/prob/p185204
     *
     * @param nums an array
     * @return true if it could be split in two equal subs, using all elements
     */
    public static boolean splitArray(int[] nums) {
        return saImpl(nums, 0, 0, 0);
    }

    /**
     * Helper for {@linkplain Recursion2#splitArray(int[])}
     *
     * @param a     array
     * @param i     starting position
     * @param left  total in left array
     * @param right total in right array
     * @return true if balanced
     */
    private static boolean saImpl(int[] a, int i, int left, int right) {
        if (i == a.length) {
            return left == right;
        }
        return saImpl(a, i + 1, left + a[i], right) || saImpl(a, i + 1, left, right + a[i]);
    }

    /**
     * codingbat.com/prob/p168295
     *
     * @param nums an array
     * @return true if could be split in two equal subs (all %5 in one, %3 in the other)
     */
    public static boolean split53(int[] nums) {
        return s53Impl(nums, 0, 0, 0);
    }

    /**
     * Helper for {@linkplain Recursion2#split53(int[])}
     *
     * @param a     array
     * @param i     starting position
     * @param five  total in "five" array
     * @param three total in "three" array
     * @return true if balanced
     */
    private static boolean s53Impl(int[] a, int i, int five, int three) {
        if (i == a.length) {
            return five == three;
        }

        if (a[i] % 5 == 0) {
            return s53Impl(a, i + 1, five + a[i], three);
        } else if (a[i] % 3 == 0) {
            return s53Impl(a, i + 1, five, three + a[i]);
        } else {
            return s53Impl(a, i + 1, five + a[i], three) || s53Impl(a, i + 1, five, three + a[i]);
        }
    }
}
