/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * sleepIn - codingbat.com/prob/p187868
 * 
 * My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

public class SleepIn {
    /**
     * Check if the caller can sleep
     * 
     * @param weekday  true from Monday to Friday
     * @param vacation true if it is a day off
     * @return true if not a weekday or in vacation
     */
    public static boolean plain(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Check verbosely if the caller can sleep
     *
     * @param weekday  true from Monday to Friday
     * @param vacation true if it is a day off
     * @return true if not a weekday or in vacation
     */
    public static boolean verbose(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}
