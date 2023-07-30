/**
 * https://codingbat.com/java/Logic-1
 */
package com.codingbat;

public class Logic1 {
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
     * codingbat.com/prob/p133158
     * 
     * @param n non-negative
     * @return true if added 1 or 2 gets multiple of 20
     */
    public static boolean less20(int n) {
        return n % 20 > 17;
    }

    /**
     * codingbat.com/prob/p178728
     * 
     * @param a first value
     * @param b second value
     * @return the sum, or, if a value is in [13..19] then 19
     */
    public static int teenSum(int a, int b) {
        return isTeen(a) || isTeen(b) ? 19 : a + b;
    }

    /**
     * Helper for {@linkplain Logic1#teenSum(int, int)}
     * 
     * @param value an integer
     * @return true if in [13..19]
     */
    private static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }

    /**
     * codingbat.com/prob/p110973
     * 
     * @param isMorning when called
     * @param isMom     mom called
     * @param isAsleep  sleeping
     * @return true if not sleeping, in the morning only mom
     * 
     *         <pre>
     * AM   Mom Sleep
     * T    T   T       F
     * T    T   F       T <--
     * T    F   T       F
     * T    F   F       F
     * F    T   T       F
     * F    T   F       T <--
     * F    F   T       F
     * F    F   F       T <--
     *         </pre>
     */
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }

    /**
     * codingbat.com/prob/p137136
     * 
     * @param str a possibly empty string
     * @return
     *         <li>"Fizz" if starts by 'f'
     *         <li>"Buzz" if ends be 'b'
     *         <li>"FizzBuzz" for both
     *         <li>input otherwise
     */
    public static String fizzString(String str) {
        if (str.isEmpty()) {
            return str;
        }

        boolean fizz = str.charAt(0) == 'f';
        boolean buzz = str.charAt(str.length() - 1) == 'b';
        if (!fizz && !buzz) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        if (fizz) {
            result.append("Fizz");
        }
        if (buzz) {
            result.append("Buzz");
        }
        return result.toString();
    }

    /**
     * codingbat.com/prob/p115243
     * 
     * @param n an integer
     * @return the number as string followed by '!' but
     *         <li>"Fizz" instead of 3 and multiples
     *         <li>"Buzz" instead of 5 and multiples
     *         <li>"FizzBuzz" for multiples of both 3 and 5
     */
    public static String fizzString2(int n) {
        StringBuilder result = new StringBuilder();

        boolean fizzOrBuzz = false;
        if (n % 3 == 0) {
            fizzOrBuzz = true;
            result.append("Fizz");
        }
        if (n % 5 == 0) {
            fizzOrBuzz = true;
            result.append("Buzz");
        }
        if (!fizzOrBuzz) {
            result.append(n);
        }

        result.append('!');
        return result.toString();
    }

    /**
     * codingbat.com/prob/p154188
     * 
     * @param a   first value
     * @param b   second value
     * @param c   third value
     * @param bOk flag
     * @return true if the values are in order
     *         <p>
     *         if the flag is true b is always considered ok
     * 
     *         <pre>
     *  bOk b>a c>b
     *  T   T   T   T   <--
     *  T   T   F   F
     *  T   F   T   T   <--
     *  T   F   F   F
     *  F   T   T   T   <--
     *  F   T   F   F
     *  F   F   T   F
     *  F   F   F   F
     *         </pre>
     */
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return c > b && (bOk || b > a);
    }

    /**
     * codingbat.com/prob/p140272
     * 
     * @param a       first value
     * @param b       second value
     * @param c       third value
     * @param equalOk flag for equality
     * @return true if the values are (strictly) increasing
     */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
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
     * @param noDoubles when true, in case of double one value is increased (wrapping around)
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
