/**
 * https://codingbat.com/java/Warmup-1
 */
package cb;

public class Warmup1 {
    /**
     * codingbat.com/prob/p187868
     *
     * @param weekday  true from Monday to Friday
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
     * @param n   a valid index for the string
     * @return a copy of the original string, less the char at n position
     */
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
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

    /**
     * codingbat.com/prob/p178986
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if an input value (or more) are in [13..19]
     */
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    /**
     * Helper for:
     * <li>{@linkplain Warmup1#hasTeen(int, int, int)}
     * <li>{@linkplain Warmup1#loneTeen(int, int)}
     * 
     * @param value a value
     * @return true if the input value is in [13..19]
     */
    private static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }

    /**
     * codingbat.com/prob/p151713
     * 
     * @param str a string
     * @return true if it begins by "?ix"
     */
    public static boolean mixStart(String str) {
        return str.length() > 2 && str.charAt(1) == 'i' && str.charAt(2) == 'x';
    }

    /**
     * codingbat.com/prob/p172021
     * 
     * @param a first value
     * @param b second value
     * @return the nearest to 10, or 0 for a tie
     */
    public static int close10(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);

        if (distA == distB) {
            return 0;
        }
        return distA < distB ? a : b;
    }

    /**
     * codingbat.com/prob/p173784
     * 
     * @param str a string
     * @return true if it contains [1..3] 'e'
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count += 1;
            }
        }
        return count > 0 && count < 4;
    }

    /**
     * codingbat.com/prob/p196441
     * 
     * @param str a non-empty string
     * @param n   1 or more
     * @return a string with chars in position 0, and then every Nth char
     */
    public static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    /**
     * codingbat.com/prob/p181646
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    /**
     * codingbat.com/prob/p140449
     * 
     * @param talking parrot state
     * @param hour    in [0..23]
     * @return true if talking before 7 or after 20
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     * codingbat.com/prob/p159227
     * 
     * @param a        first value
     * @param b        second value
     * @param negative flag
     * @return true
     *         <li>if one is negative and the other positive
     *         <li>both are negative and the flag is true
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            return (a >= 0 && b < 0) || (a < 0 && b >= 0);
        } else {
            return a < 0 && b < 0;
        }
    }

    /**
     * codingbat.com/prob/p123384
     * 
     * @param str a possibly empty string
     * @return swap first / last char
     */
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }

        final int last = str.length() - 1;
        return str.substring(last) + str.substring(1, last) + str.charAt(0);
    }

    /**
     * codingbat.com/prob/p154485
     * 
     * @param a first value
     * @param b second value
     * @return the values sum, doubled if they are same
     */
    public static int sumDouble(int a, int b) {
        return (a + b) * (a == b ? 2 : 1);
    }

    /**
     * codingbat.com/prob/p182873
     * 
     * @param a first value
     * @param b second value
     * @return true if one if them is 10 or if their sum is 10
     */
    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    /**
     * codingbat.com/prob/p191914
     * 
     * @param str a string
     * @return add prefix "not" but do not double it
     */
    public static String notString(String str) {
        String prefix = "not";
        if (str.startsWith(prefix)) {
            return str;
        } else {
            return prefix + " " + str;
        }
    }

    /**
     * codingbat.com/prob/p136351
     * 
     * @param str a possibly empty string
     * @return Three times the first three chars (if available)
     */
    public static String front3(String str) {
        String tag = str.substring(0, Math.min(str.length(), 3));
        return tag + tag + tag;
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a possibly empty string
     * @return Three times the first three chars (if available)
     */
    public static String front3J11(String str) {
        return str.substring(0, Math.min(str.length(), 3)).repeat(3);
    }

    /**
     * codingbat.com/prob/p112564
     * 
     * @param n a non negative number
     * @return if it is a multiple of 3 or 5
     */
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    /**
     * codingbat.com/prob/p183592
     * 
     * @param str a possibly empty string
     * @return add the first 2 char (when available) to begin and end
     */
    public static String front22(String str) {
        String tag = str.substring(0, Math.min(str.length(), 2));
        return tag + str + tag;
    }

    /**
     * codingbat.com/prob/p192082
     * 
     * @param temp1 first temperature
     * @param temp2 second temperature
     * @return true if one is less than 0 and the other is greater than 100
     */
    public static boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }

    /**
     * codingbat.com/prob/p144535
     * 
     * @param a first value
     * @param b second value
     * @return true if either of them is in the range 10..20 inclusive
     */
    public static boolean in1020(int a, int b) {
        return isIn1020(a) || isIn1020(b);
    }

    /**
     * Helper for {@linkplain Warmup1#in1020(int, int)}
     * 
     * @param value a value
     * @return true if in [10..20]
     */
    private static boolean isIn1020(int value) {
        return value > 9 && value < 21;
    }

    /**
     * codingbat.com/prob/p165701
     * 
     * @param a first value
     * @param b second value
     * @return return true if only one is in [13 .. 19]
     */
    public static boolean loneTeen(int a, int b) {
        return isTeen(a) ^ isTeen(b);
    }

    /**
     * codingbat.com/prob/p100905
     * 
     * @param str a string
     * @return copy without "del", if in position 1
     */
    public static String delDel(String str) {
        return str.indexOf("del") == 1 ? str.charAt(0) + str.substring(4) : str;
    }

    /**
     * codingbat.com/prob/p199720
     * 
     * @param str a possibly empty string
     * @return "oz", if they are at the beginning in that places
     */
    public static String startOz(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'o') {
            result.append('o');
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result.append('z');
        }

        return result.toString();
    }

    /**
     * https://codingbat.com/prob/p101887
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return the biggest one
     */
    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
