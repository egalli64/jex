/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * inOrder - https://codingbat.com/prob/p154188
 * <p>
 * Check if the passed arguments are strictly in natural order. The flag bOK,
 * when true, signal that the parameter b should be checked against a.
 * <p>
 * So, always check c against b, but check b against a only when required
 * 
 * <pre>
 *  bOk b>a c>b
 *  T   T   T   T   <--
 *  T   T   F   F
 *  T   F   T   T   <--
 *  T   F   F   F
 *  F   T   T   T   <--
 *  F   T   F   F
 *  F   F   T   F
 *  F   F   F   F
 * </pre>
 */
public class InOrder {
    /**
     * Two different conditions, chosen by bOk
     * 
     * @param a   first value
     * @param b   second value
     * @param c   third value
     * @param bOk flag
     * @return true if the values are in order
     */
    public static boolean solution(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return c > b && b > a;
        }
    }

    /**
     * A single, a bit more complicated, condition
     * 
     * @param a   first value
     * @param b   second value
     * @param c   third value
     * @param bOk flag
     * @return true if the values are in order
     */
    public static boolean compact(int a, int b, int c, boolean bOk) {
        return c > b && (bOk || b > a);
    }
}
