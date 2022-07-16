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

    /**
     * codingbat.com/prob/p170371
     * 
     * @param str a string
     * @return the number of lowercase 'x' chars in the string
     */
    public static int countX(String str) {
        return str.length() == 0 ? 0 : countX(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#countX(String)}
     * 
     * @param str a string
     * @param beg the initial position to consider in the string
     * @return the number of 'x' from beg in the string
     */
    private static int countX(String str, int beg) {
        if (beg < str.length()) {
            return (str.charAt(beg) == 'x' ? 1 : 0) + countX(str, beg + 1);
        }
        return 0;
    }

    /**
     * codingbat.com/prob/p170924
     * 
     * @param str a string
     * @return a string where each "pi" is replaced be "3.14"
     */
    public static String changePi(String str) {
        return str.length() < 2 ? str : changePi(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#changePi(String)}
     * 
     * @param str a string
     * @param beg the initial position to consider in the string
     * @return a string where each "pi" is replaced be "3.14"
     */
    private static String changePi(String str, int beg) {
        int piPos = str.indexOf("pi", beg);
        if (piPos == -1) {
            return str.substring(beg);
        }
        return str.substring(beg, piPos) + "3.14" + changePi(str, piPos + 2);
    }

    /**
     * codingbat.com/prob/p135988
     * 
     * @param nums  an array
     * @param index first position to consider
     * @return count the 11 in the specified part of the array
     */
    public static int array11(int[] nums, int index) {
        if (index < 0 || index >= nums.length) {
            return 0;
        }
        return (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);
    }
}
