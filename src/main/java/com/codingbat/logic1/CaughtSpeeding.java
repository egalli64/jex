/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * caughtSpeeding - https://codingbat.com/prob/p157733
 * <p>
 * Calculate the speed ticket accordingly to the actual speed, but consider that
 * if isBrithday is true there is a 5 bonus on speed limit.
 * <li>[.. 60]: 0 = no ticket
 * <li>[61..80]: 1 = small ticket
 * <li>[81 ..]: 2 = big ticket
 */
public class CaughtSpeeding {
    /**
     * Change the speed if isBirthday, then check it against intervals
     *
     * @param speed      driver current speed
     * @param isBirthday true when on birthday
     * @return 0, 1, 2 accordingly to the speed (w/ bonus)
     */
    public static int solution(int speed, boolean isBirthday) {
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
}
