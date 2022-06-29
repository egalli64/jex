/**
 * https://codingbat.com/java/Warmup-1
 */
package cb;

public class Warmup1 {
    /**
     * codingbat.com/prob/p187868
     *
     * @param weekday true from Monday to Friday
     * @param vacation true if it is a day off
     * @return true if not a weekday or in vacation
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * codingbat.com/prob/p116624
     *
     * @param n an integer
     * @return the absolute difference between n and 21, doubled if n is over 21
     */
    public static int diff21(int n) {
        return n <= 21 ? 21 - n : 2 * (n - 21);
    }

    /**
     * codingbat.com/prob/p184004
     *
     * @param n an integer
     * @return true if n distance to 100 or 200 is within 10
     */
    public static boolean nearHundred(int n) {
        return n >= 90 && n <= 110 || n >= 190 && n <= 210;
    }

    /**
     * codingbat.com/prob/p190570
     *
     * @param str a non-empty string
     * @param n a valid index for the string
     * @return a copy of the original string, less the char at n position
     */
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);
    }

    /**
     * codingbat.com/prob/p161642
     *
     * @param str a non-empty string
     * @return a copy of the original string with the last char added at the front and back
     */
    public static String backAround(String str) {
        String tag = str.substring(str.length() - 1);
        return tag + str + tag;
    }

    /**
     * codingbat.com/prob/p191022
     *
     * @param str a possibly empty string
     * @return true if the string starts with "hi"
     */
    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

}
