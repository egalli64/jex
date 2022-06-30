/**
 * https://codingbat.com/java/Logic-1
 */
package cb;

public class Logic1 {
    /**
     * codingbat.com/prob/p159531
     *
     * @param cigars    number of available cigars
     * @param isWeekend true if it is Saturday or Sunday
     * @return true if cigars is in [40..60] during working days, or they are at least 40 in the weekend
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return cigars >= 40 && (cigars <= 60 || isWeekend);
    }

    /**
     * codingbat.com/prob/p157733
     *
     * @param speed      driver current speed, as an int
     * @param isBirthday true if today is their birthday
     * @return 0, 1, 2 accordingly to the speed, 60, 80, or above. Bonus of 5 for birthday
     */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        }
        if (speed <= 80) {
            return 1;
        }
        return 2;
    }

    /**
     * codingbat.com/prob/p137742
     *
     * @param a first value
     * @param b second value
     * @return true if a, or b, or their sum, or their difference is 6
     */
    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
}
