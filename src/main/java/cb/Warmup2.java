/**
 * https://codingbat.com/java/Warmup-2
 */
package cb;

public class Warmup2 {
    /**
     * codingbat.com/prob/p142270
     *
     * <p>Java 11 is currently _not_ supported by CodingBat
     * <p>For a pre-11 solution see {@linkplain Warmup2#stringTimes(String, int)}
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
     * <p>For a Java 11 solution see {@linkplain Warmup2#stringTimes11(String, int)}
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
        for (int pos = -1; (pos = str.indexOf(tag, pos + 1)) < end; ) {
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
        for (int i = 0; i < str.length(); ) {
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
        if(nums.length < 3) {
            return true;
        }

        int count = 1;
        int triplet = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == triplet) {
                count += 1;
                if(count == 3) {
                    return false;
                }
            } else {
                count = 1;
                triplet = nums[i];
            }
        }
        return true;
    }
}
