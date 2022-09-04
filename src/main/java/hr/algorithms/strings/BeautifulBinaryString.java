/*
 * Prepare > Algorithms > String > Beautiful Binary String
 * https://www.hackerrank.com/challenges/beautiful-binary-string/
 *
 * Given a non-empty string of chars in [01]
 * return the minimum number of changes to avoid having "010" subsequences in it
 */
package hr.algorithms.strings;

public class BeautifulBinaryString {
    public static int beautifulBinaryString(String b) {
        int counter = 0;
        int pos = 0;
        while ((pos = b.indexOf("010", pos)) != -1) {
            pos += 3;
            counter += 1;
        }
        return counter;
    }
}
