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

    /**
     * codingbat.com/prob/p196640
     * 
     * @param nums non-empty
     * @return difference between largest and smallest value
     */
    public static int bigDiff(int[] nums) {
        int small = nums[0];
        int large = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            } else if (nums[i] > large) {
                large = nums[i];
            }
        }

        return large - small;
    }

    /**
     * codingbat.com/prob/p136585
     * 
     * @param nums sized 3+
     * @return "centered" integer average, ignoring both one extreme left and right
     */
    public static int centeredAverage(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < small) {
                small = nums[i];
            } else if (nums[i] > large) {
                large = nums[i];
            }
        }
        return (sum - large - small) / (nums.length - 2);
    }

    /**
     * codingbat.com/prob/p111327
     * 
     * @param nums an array
     * @return sum of elements, ignoring sections delimited by 6 and 7
     */
    public static int sum67(int[] nums) {
        int result = 0;

        boolean excluded = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                excluded = true;
            }
            if (!excluded) {
                result += nums[i];
            }
            if (nums[i] == 7) {
                excluded = false;
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p121853
     * 
     * @param nums an array
     * @return true if contains subsequence [2, 2]
     */
    public static boolean has22(int[] nums) {
        boolean prev = nums.length == 0 || nums[0] == 2;
        for (int i = 1; i < nums.length; i++) {
            boolean cur = nums[i] == 2;
            if (prev && cur) {
                return true;
            }
            prev = cur;
        }
        return false;
    }

    /**
     * codingbat.com/prob/p199612
     * 
     * @param nums an array
     * @return true if sum of 2s is 8
     */
    public static boolean sum28(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 2) {
                count += 1;
            }
        }
        return count == 4;
    }

    /**
     * codingbat.com/prob/p104627
     * 
     * @param nums an array
     * @return are 1s more than 4s?
     */
    public static boolean more14(int[] nums) {
        int deltaOneFour = 0;

        for (int num : nums) {
            if (num == 1) {
                deltaOneFour += 1;
            } else if (num == 4) {
                deltaOneFour -= 1;
            }
        }

        return deltaOneFour > 0;
    }

    /**
     * codingbat.com/prob/p186672
     * 
     * @param nums an array
     * @return true if only 1 and 4
     */
    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p178353
     * 
     * @param n non-negative
     * @return the strings from zero up to n (excluded)
     */
    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    /**
     * codingbat.com/prob/p110222
     * 
     * @param nums an array
     * @param val  a value
     * @return true if any element is val or has val as neighbor
     * @apiNote curiously, if the array is to short to check, true is expected
     */
    public static boolean isEverywhere(int[] nums, int val) {
        if (nums.length == 0 || nums.length == 1 && nums[0] != val) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val && nums[i - 1] != val) {
                return false;
            }
        }
        return true;
    }
}
