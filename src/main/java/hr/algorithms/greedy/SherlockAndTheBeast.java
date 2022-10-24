/*
 * Prepare > Algorithms > Greedy > Sherlock and The Beast
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast/
 *
 * Given a positive integer less or equal to 100_000
 * Return the associated Decent Number (or -1)
    Its digits can only be 3's and/or 5's.
    The number of 3's it contains is divisible by 5.
    The number of 5's it contains is divisible by 3.
    It is the largest such number for its length.
 */
package hr.algorithms.greedy;

public class SherlockAndTheBeast {
    public static String decentNumber(int n) {
        if (n % 3 == 0) {
            return "5".repeat(n);
        }

        for (int i = n - 1; i >= 3; i--) {
            if (i % 3 == 0 && (n - i) % 5 == 0) {
                return "5".repeat(i) + "3".repeat(n - i);
            }
        }

        if (n % 5 == 0) {
            return "3".repeat(n);
        }

        return "-1";
    }
}
