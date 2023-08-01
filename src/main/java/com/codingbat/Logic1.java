/**
 * https://codingbat.com/java/Logic-1
 */
package com.codingbat;

public class Logic1 {
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
     * codingbat.com/prob/p179196
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if one is 10+ distant from another one
     */
    public static boolean lessBy10(int a, int b, int c) {
        return isFar10(a, b) || isFar10(b, c) || isFar10(a, c);
    }

    /**
     * Helper for {@linkplain Logic1#lessBy10(int, int, int)}
     * 
     * @param left  first value
     * @param right second value
     * @return true if distance is 10+
     */
    private static boolean isFar10(int left, int right) {
        return Math.abs(left - right) >= 10;
    }

    /**
     * codingbat.com/prob/p115233
     * 
     * @param die1      [1..6]
     * @param die2      [1..6]
     * @param noDoubles when true, in case of double one value is increased
     *                  (wrapping around)
     * @return the sum
     */
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return die1 + (noDoubles && die1 == die2 ? 1 + die2 % 6 : die2);
    }

    /**
     * codingbat.com/prob/p170833
     * 
     * @param a [0,1,2]
     * @param b [0,1,2]
     * @param c [0,1,2]
     * @return 2,2,2 -> 10; x,x,x -> 5; both b,c != a -> 1; else 0
     */
    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return a == 2 ? 10 : 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    /**
     * 
     * @param a ticket
     * @param b ticket
     * @param c ticket
     * @return all different -> 0; all same -> 20; couple -> 10
     */
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a != b && b != c && a != c) {
            return 0;
        }

        return 10;
    }

    /**
     * codingbat.com/prob/p192267
     * 
     * @param a ticket
     * @param b ticket
     * @param c ticket
     * @return sum ab, bc, ac; all 10 -> 10; ab is 10 + bc or ac -> 5, else 0
     */
    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        }
        if (ab == 10 + bc || ab == 10 + ac) {
            return 5;
        }

        return 0;
    }

    /**
     * codingbat.com/prob/p153748
     * 
     * @param a [10..99]
     * @param b [10..99]
     * @return true if same digit appears in both numbers
     */
    public static boolean shareDigit(int a, int b) {
        int[] as = { a % 10, a / 10 };
        int[] bs = { b % 10, b / 10 };
        return as[0] == bs[0] || as[1] == bs[0] || as[0] == bs[1] || as[1] == bs[1];
    }

    /**
     * codingbat.com/prob/p118077
     * 
     * @param a non-negative
     * @param b non-negative
     * @return the sum, if in the same magnitude of a; else a
     */
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        return countDigit(a) == countDigit(sum) ? sum : a;
    }

    /**
     * Helper for {@linkplain Logic1#sumLimit(int, int)}
     * 
     * @param value non-negative
     * @return the number of digits
     */
    private static int countDigit(int value) {
        int count = 0;
        while (value > 0) {
            value /= 10;
            count += 1;
        }
        return count;
    }
}
