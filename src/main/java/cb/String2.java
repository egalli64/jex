/**
 * https://codingbat.com/java/String-2
 */
package cb;

import java.util.regex.Pattern;

public class String2 {
    private String2() {
    }

    /**
     * codingbat.com/prob/p165312
     *
     * @param str a string
     * @return copy of str, where each char is duplicated
     */
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p123614
     *
     * @param str a string
     * @return how many times the pattern "co.e" is present in the string
     */
    public static int countCode(String str) {
        int count = 0;
        int pos = 0;
        do {
            pos = str.indexOf("co", pos);
            if (pos != -1) {
                if (pos < str.length() - 3 && str.charAt(pos + 3) == 'e') {
                    count += 1;
                    pos += 2;
                }
                pos += 2;
            }
        } while (pos != -1);

        return count;
    }

    /**
     * codingbat.com/prob/p123614
     *
     * <p>
     * Java 9 is currently _not_ supported by CodingBat
     * <p>
     * For a pre-9 solution see {@linkplain String2#countCode(String)}
     *
     * @param str a string
     * @return how many times the pattern "co.e" is present in the string
     */
    public static int countCode9(String str) {
        return (int) Pattern.compile("(co.e)").matcher(str).results().count();
    }

    /**
     * codingbat.com/prob/p175762
     *
     * @param str a string
     * @return true if it contains the pattern "b.b"
     */
    public static boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }

    /**
     * Java 11 not supported by CodingBat, see
     * {@linkplain String2#repeatEnd(String, int)}
     */
    public static String repeatEnd11(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }

    /**
     * codingbat.com/prob/p152339
     * 
     * @param str a possibly empty string
     * @param n   a number in [0, string.length()]
     * @return The last n char of str repeated n times
     */
    public static String repeatEnd(String str, int n) {
        String base = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(base);
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p136417
     * 
     * @param str a non emtpy string
     * @param n   an int in [1,str.length()]
     * @return true if the prefix till n is repeated in the string
     */
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    /**
     * codingbat.com/prob/p194491
     * 
     * @param str a string
     * @return true if any * in it not in extreme positions has same neighbors
     */
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
