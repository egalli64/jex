/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * parrotTrouble - https://codingbat.com/prob/p140449
 * <p>
 * Check trouble caused by parrot
 */
public class ParrotTrouble {
    /**
     * Plain
     * 
     * @param talking parrot state
     * @param hour    in [0..23]
     * @return true if talking before 7 or after 20
     */
    public static boolean plain(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     * Exposing full details
     * 
     * @param talking parrot state
     * @param hour    in [0..23]
     * @return true if talking before 7 or after 20
     */
    public static boolean verbose(boolean talking, int hour) {
        if (talking == true) {
            if (hour < 7 || hour > 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
