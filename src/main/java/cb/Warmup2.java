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
}
