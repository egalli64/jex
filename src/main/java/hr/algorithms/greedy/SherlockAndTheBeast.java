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
        int fives = n;
        while(fives % 3 != 0) {
            fives -= 1;
        }

        for (int i = fives; i >= 0; i-=3) {
            if ((n - i) % 5 == 0) {
                return "5".repeat(i) + "3".repeat(n - i);
            }
        }

        return "-1";
    }
}
