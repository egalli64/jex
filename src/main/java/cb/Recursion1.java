/**
 * https://codingbat.com/java/Recursion-1
 */
package cb;

public class Recursion1 {
    /**
     * codingbat.com/prob/p154669
     *
     * @param n a (small) non-negative int
     * @return n! calculated recursively
     */
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * codingbat.com/prob/p107330
     *
     * @param bunnies the non-negative number of bunnies
     * @return the bunny ear count (even bunnies have 3 ears!) calculated recursively
     */
    public static int bunnyEars2(int bunnies) {
        if (bunnies < 1) {
            return 0;
        }
        return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1);
    }

    /**
     * codingbat.com/prob/p101409
     *
     * @param n non-negative
     * @return how many 7 are in n (as decimal integer)
     */
    public static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
    }
}
