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

    /**
     * codingbat.com/prob/p118290
     * 
     * @param n a non-negative number
     * @return if n is 1 or 2 more than a multiple of 20
     */
    public static boolean more20(int n) {
        int checked = n % 20;
        return checked == 1 || checked == 2;
    }

    /**
     * codingbat.com/prob/p193613
     * 
     * @param num a non-negative number
     * @return true if it is within 2 of a multiple of 10
     */
    public static boolean nearTen(int num) {
        int checked = num % 10;
        return checked > 7 || checked < 3;
    }

    /**
     * codingbat.com/prob/p177181
     * 
     * @param tea   a non negative value
     * @param candy a non negative value
     * @return 1 if both are at least 5; 2 if one is at least the double of the other; 0 if either is less than 5
     */
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }

        return 1;
    }

    /**
     * codingbat.com/prob/p113261
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if a value is the sum of the other two ones
     */
    public static boolean twoAsOne(int a, int b, int c) {
        return a == b + c || b == a + c || c == a + b;
    }

    /**
     * codingbat.com/prob/p169213
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if at least two values have the same last decimal cipher
     */
    public static boolean lastDigit(int a, int b, int c) {
        a %= 10;
        b %= 10;
        c %= 10;
        return a == b || b == c || c == a;
    }

    /**
     * codingbat.com/prob/p115384
     * 
     * @param a first value
     * @param b second value
     * @return 0, the smaller, the bigger, in case:
     *         <li>they are equal,
     *         <li>they are equal modulo 5
     *         <li>otherwise
     */
    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        return a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
    }

    /**
     * codingbat.com/prob/p103360
     * 
     * @param you  [0..10]
     * @param date [0..10]
     * @return a value in [0..2]
     *         <li>0: at least a 2-
     *         <li>2: at least a 8+
     *         <li>1: otherwise
     */
    public static int dateFashion(int you, int date) {
        if (you < 3 || date < 3) {
            return 0;
        }
        if (you > 7 || date > 7) {
            return 2;
        }

        return 1;
    }

    /**
     * codingbat.com/prob/p141061
     * 
     * @param temp     the current Fahrenheit temperature
     * @param isSummer summer flag
     * @return true if temp is in [60..90], upper limit 100 in summer
     */
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return temp >= 60 && temp <= 90 + (isSummer ? 10 : 0);
    }

    /**
     * codingbat.com/prob/p183071
     * 
     * @param a first value
     * @param b second value
     * @return the sum, but [10..19] leads to 20
     */
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        return sum < 10 || sum > 19 ? sum : 20;
    }
}
