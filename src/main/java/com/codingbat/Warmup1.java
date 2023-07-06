/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat;

public class Warmup1 {

    /*-
     * a+  b+  neg return 
     * T   T   T   F   
     * T   T   F   F
     * T   F   T   F
     * T   F   F   T <-
     * F   T   T   F
     * F   T   F   T <-
     * F   F   T   T <-
     * F   F   F   F
     */
    public static boolean posNegEx(int a, int b, boolean negative) {
        return a > 0 ^ b > 0 && !negative || a < 0 && b < 0 && negative;
    }
}
