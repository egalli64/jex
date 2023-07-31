/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * answerCell - https://codingbat.com/prob/p110973
 * <p>
 * return false only if:
 * <li>isAsleep
 * <li>isMorning and not isMom
 * 
 * <pre>
 * AM   Mom Sleep
 * T    T   T       F
 * T    T   F       T <--
 * T    F   T       F
 * T    F   F       F
 * F    T   T       F
 * F    T   F       T <--
 * F    F   T       F
 * F    F   F       T <--
 * </pre>
 */
public class AnswerCell {
    /**
     * Beware of logical operator precedence
     * 
     * @param isMorning when called
     * @param isMom     mom called
     * @param isAsleep  sleeping
     * @return true if not sleeping, in the morning only mom
     */
    public static boolean solution(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }
}
