/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * cigarParty - https://codingbat.com/prob/p159531
 * <p>
 * Check if a squirrel party is successful. The cigars should be at least 40,
 * with a maximum of 60 in the week days. No upper bound in the weekends.
 */
public class CigarParty {
    /**
     * Be careful with && and || precedence
     *
     * @param cigars    number of available cigars
     * @param isWeekend true if it is Saturday or Sunday
     * @return true if cigars is in [40..60] during working days, or they are at
     *         least 40 in the weekend
     */
    public static boolean solution(int cigars, boolean isWeekend) {
        return cigars >= 40 && (isWeekend || cigars <= 60);
    }
}
