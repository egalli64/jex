/*
 * Prepare > Algorithms > Strings > Funny String
 * https://www.hackerrank.com/challenges/funny-string/
 * <p>
 * A string sized 2+ is funny if the absolute difference of chars is the same in both direction
 * Return (Not) Funny
 */
package hr.algorithms.sorting;

public class FunnyString {
    public static String funnyString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int up = Math.abs(s.charAt(i) - s.charAt(i + 1));
            int last = s.length() - 1 - i;
            int down = Math.abs(s.charAt(last) - s.charAt(last - 1));
            if (up != down) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
