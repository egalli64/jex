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
}
