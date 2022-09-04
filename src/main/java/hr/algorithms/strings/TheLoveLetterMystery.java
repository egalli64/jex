/*
 * Prepare > Algorithms > String > The Love-Letter Mystery
 * https://www.hackerrank.com/challenges/the-love-letter-mystery/
 * <p>
 * Given a non-empty string of chars in [a-z]
 * return the minimum delta in chars to change the string in a palindrome
 */
package hr.algorithms.strings;

public class TheLoveLetterMystery {
    public static int theLoveLetterMystery(String s) {
        int result = 0;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            result += Math.abs(s.charAt(i) - s.charAt(j));
        }
        return result;
    }
}
