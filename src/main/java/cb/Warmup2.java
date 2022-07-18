/**
 * https://codingbat.com/java/Warmup-2
 */
package cb;

public class Warmup2 {
    /**
     * codingbat.com/prob/p142270
     *
     * <p>
     * Java 11 is currently _not_ supported by CodingBat
     * <p>
     * For a pre-11 solution see {@linkplain Warmup2#stringTimes(String, int)}
     *
     * @param str a possibly empty string
     * @param n   multiplier
     * @return the original string multiplied by n
     */
    public static String stringTimes11(String str, int n) {
        return str.repeat(n);
    }

    /**
     * codingbat.com/prob/p142270
     *
     * <p>
     * For a Java 11 solution see {@linkplain Warmup2#stringTimes11(String, int)}
     *
     * @param str a possibly empty string
     * @param n   multiplier
     * @return the original string multiplied by n
     */
    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    /**
     * codingbat.com/prob/p186759
     *
     * @param str a possibly empty string
     * @return true if the first 'x' in it is immediately followed by another 'x'
     */
    public static boolean doubleX(String str) {
        int x = str.indexOf('x');
        return x >= 0 && x < str.length() - 1 && str.charAt(x + 1) == 'x';
    }

    /**
     * codingbat.com/prob/p178318
     *
     * @param str a possibly empty string
     * @return how many times the last two chars are repeated in str
     */
    public static int last2(String str) {
        if (str.length() < 3) {
            return 0;
        }

        final int end = str.length() - 2;
        String tag = str.substring(end);
        int count = 0;
        for (int pos = -1; (pos = str.indexOf(tag, pos + 1)) < end;) {
            count += 1;
        }
        return count;
    }

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
     * @return a substring extracting char in position 0, 1, 4, ..., prev + 1, prev + 3, ...
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
     * codingbat.com/prob/p101475
     * 
     * @param str a string
     * @param n   a non negative number
     * @return n times the first 3 chars (or less)
     */
    public static String frontTimes(String str, int n) {
        int len = str.length() < 3 ? str.length() : 3;
        String base = str.substring(0, len);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(base);
        }
        return result.toString();
    }

    /**
     * Solution currently not supported by CodingBat (Java 11 required)
     * 
     * @param str a string
     * @param n   a non negative number
     * @return n times the first 3 chars (or less)
     */
    public static String frontTimes11(String s, int n) {
        return s.substring(0, s.length() < 3 ? s.length() : 3).repeat(n);
    }

    /**
     * codingbat.com/prob/p165666
     * 
     * @param str a string
     * @return copy of input string stripped of chars in odd position
     */
    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p184031
     * 
     * @param nums an array
     * @return the number of 9 in it
     */
    public static int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (i == 9) {
                counter += 1;
            }
        }
        return counter;
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
     * codingbat.com/prob/p194667
     * 
     * @param str a string
     * @return the number of possibly overlapping "xx"
     */
    public static int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count += 1;
            }
        }

        return count;
    }

    /**
     * https://codingbat.com/prob/p117334
     * 
     * @param str a string
     * @return the concatenation of all the substrings
     */
    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p186031
     * 
     * @param nums a possibly empty array
     * @return true if there is a 9 in the first four positions
     */
    public static boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
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
