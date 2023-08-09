/**
 * https://codingbat.com/java/Warmup-2
 */
package com.codingbat;

public class Warmup2 {
    /**
     * codingbat.com/prob/p136041
     *
     * @param nums a possibly empty array
     * @return true if contains the sequence 1, 2, 3
     */
    public static boolean array123(int[] nums) {
        int next = 1;
        for (int num : nums) {
            if (num == next) {
                if (num == 3) {
                    return true;
                }
                next += 1;
            } else {
                next = num == 1 ? 2 : 1;
            }
        }
        return false;
    }

    /**
     * codingbat.com/prob/p121596
     *
     * @param str a possibly empty string
     * @return a substring extracting char in position 0, 1, 4, ..., prev + 1, prev
     *         + 3, ...
     */
    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length();) {
            result.append(str.charAt(i));
            i += (i % 2 == 1) ? 3 : 1;
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p170221
     *
     * @param nums a possibly empty array
     * @return true if it does not contain any chained triplet
     */
    public static boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        int count = 1;
        int triplet = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == triplet) {
                count += 1;
                if (count == 3) {
                    return false;
                }
            } else {
                count = 1;
                triplet = nums[i];
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p198640
     * 
     * @param a first string
     * @param b second string
     * @return how many same length 2 substring are in the same position
     */
    public static int stringMatch(String a, String b) {
        int count = 0;

        final int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                count += 1;
            }
        }

        return count;
    }

    /**
     * codingbat.com/prob/p126212
     * 
     * @param str a string
     * @return a copy of input, with all "y?k" removed
     */
    public static String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == 'y' && i < str.length() - 2 && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result.append(cur);
            }
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p167430
     * 
     * @param nums an array
     * @return check pattern [x, x+5, x-1 (delta 2)]
     */
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            if (nums[i + 1] == x + 5 && Math.abs(nums[i + 2] - (x - 1)) < 3) {
                return true;
            }
        }
        return false;
    }


    /**
     * codingbat.com/prob/p171260
     * 
     * @param str a string
     * @return remove all 'x' but the extreme ones
     */
    public static String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            char cur = str.charAt(i);
            if (cur != 'x') {
                result.append(cur);
            }
        }
        result.append(str.charAt(str.length() - 1));
        return result.toString();
    }

    /**
     * codingbat.com/prob/p110019
     * 
     * @param nums an array
     * @return count couples of 6 and 6 or 7
     */
    public static int array667(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result += 1;
            }
        }

        return result;
    }
}
