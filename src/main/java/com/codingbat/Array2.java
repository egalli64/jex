/**
 * https://codingbat.com/java/Array-2
 */
package com.codingbat;

import java.util.Arrays;

public class Array2 {
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
        for (int num : nums) {
            if (num == 6) {
                excluded = true;
            }
            if (!excluded) {
                result += num;
            }
            if (num == 7) {
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

    /**
     * codingbat.com/prob/p191878
     * 
     * @param nums an array
     * @return true if contains sub [2, 2] of [4, 4], but not both
     */
    public static boolean either24(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        boolean sub2 = false;
        boolean sub4 = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) {
                sub2 = true;
            }
            if (nums[i] == 4 && nums[i - 1] == 4) {
                sub4 = true;
            }
        }
        return sub2 ^ sub4;
    }

    /**
     * codingbat.com/prob/p168357
     * 
     * @param nums an array
     * @return true if contains sub [7, 7] or [7, x, 7]
     */
    public static boolean has77(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == 7 && nums[i + 1] == 7) {
                return true;
            } else if (nums[i] == 7 && (nums[i - 1] == 7 || nums[i + 1] == 7)) {
                return true;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p169260
     * 
     * @param nums an array
     * @return true if there is a 1 followed (maybe later) by 2
     */
    public static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
                break;
            }
        }

        return false;
    }

    /**
     * codingbat.com/prob/p159979
     * 
     * @param nums an array
     * @return true if it has a sub of 3 even or odd values
     */
    public static boolean modThree(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) {
                return true;
            }
            if (nums[i - 1] % 2 == 1 && nums[i] % 2 == 1 && nums[i + 1] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p109783
     * 
     * @param nums an array
     * @return true if there are exactly three _separated_ 3
     */
    public static boolean haveThree(int[] nums) {
        if (nums.length < 5) {
            return false;
        }

        int count = nums[0] == 3 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i - 1] == 3) {
                    return false;
                }
                count += 1;
            }
        }

        return count == 3;
    }

    /**
     * codingbat.com/prob/p102145
     * 
     * @param nums an array
     * @return true if each 2 is not alone
     */
    public static boolean twoTwo(int[] nums) {
        if (nums.length < 2) {
            return nums.length == 0 || nums[0] != 2;
        }

        if (nums[0] == 2 && nums[1] != 2) {
            return false;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2) {
                return false;
            }
        }

        return nums.length <= 2 || nums[nums.length - 1] != 2 || nums[nums.length - 2] == 2;
    }

    /**
     * codingbat.com/prob/p134300
     * 
     * @param nums an array sized len or less
     * @param len  an int less or equal to nums length
     * @return true if the first len elements are also in the end
     */
    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            int pos = nums.length - len + i;
            if (nums[i] != nums[pos]) {
                return false;
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p137874
     * 
     * @param nums an array
     * @return true if contains a sub of three increasing adjacent ints
     */
    public static boolean tripleUp(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i] - 1 && nums[i] == nums[i + 1] - 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p142539
     * 
     * @param start first (included)
     * @param end   last (excluded), not smaller than first
     * @return the generated array
     */
    public static int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }

    /**
     * codingbat.com/prob/p105031
     * 
     * @param nums an array
     * @return left shifted array
     */
    public static int[] shiftLeft(int[] nums) {
        if (nums.length != 0) {
            int buffer = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = buffer;
        }

        return nums;
    }

    /**
     * codingbat.com/prob/p199484
     * 
     * @param nums an array
     * @return 10x changes the followers to itself, until next 10x
     */
    public static int[] tenRun(int[] nums) {
        boolean active = false;
        int changer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                changer = nums[i];
                active = true;
            } else if (active) {
                nums[i] = changer;
            }
        }
        return nums;
    }

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
