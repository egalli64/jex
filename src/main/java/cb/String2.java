/**
 * https://codingbat.com/java/String-2
 */
package cb;

import java.util.regex.Pattern;

public class String2 {
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
     * <p>Java 9 is currently _not_ supported by CodingBat
     * <p>For a pre-9 solution see {@linkplain String2#countCode(String)}
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
}
