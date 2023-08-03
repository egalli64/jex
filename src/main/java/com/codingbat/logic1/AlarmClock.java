/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * alarmClock - https://codingbat.com/prob/p160543
 * <p>
 * Given the current day as integer in [0..6], where 0 is Sunday, and a flag
 * true for holiday, return a string representing the alarm clock setting:
 * <li>"7:00" on working weekdays
 * <li>"10:00" on working weekends
 * <li>"10:00" on vacation weekdays
 * <li>"off" on vacation weekends
 */
public class AlarmClock {
    /**
     * Check the couple day and vacation flag, return the setting
     * 
     * @param day      [0..6]
     * @param vacation true on holiday
     * @return
     */
    public static String solution(int day, boolean vacation) {
        if (day > 0 && day < 6 && !vacation) {
            return "7:00";
        } else if (vacation && (day == 0 || day == 6)) {
            return "off";
        } else {
            return "10:00";
        }
    }
}
