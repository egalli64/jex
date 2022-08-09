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

    /**
     * codingbat.com/prob/p183649
     *
     * @param bunnies non-negative
     * @return number of ears, no loop or multiplication allowed
     */
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    /**
     * codingbat.com/prob/p120015
     *
     * @param n non-negative
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, ... -> 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     */
    public static int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * codingbat.com/prob/p194781
     *
     * @param rows non-negative
     * @return 0, 1, 2, 3, 4, 5, ... -> 0, 1, 3, 6, 10, 15, ...
     */
    public static int triangle(int rows) {
        if (rows < 2) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    /**
     * codingbat.com/prob/p163932
     *
     * @param n non-negative
     * @return sum of digits
     */
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumDigits(n / 10);
    }

    /**
     * codingbat.com/prob/p192383
     *
     * @param n non-negative
     * @return number of 8s, but 8 with another 8 to its left counts 2
     */
    public static int count8(int n) {
        if (n < 18) {
            return n == 8 ? 1 : 0;
        }
        return (n % 100 == 88 ? 2 : n % 10 == 8 ? 1 : 0) + count8(n / 10);
    }

    /**
     * codingbat.com/prob/p158888
     *
     * @param base 1+
     * @param n    1+
     * @return base ** n
     */
    public static int powerN(int base, int n) {
        assert n > 0;

        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    /**
     * codingbat.com/prob/p184029
     *
     * @param str a string
     * @return number of "hi" in it
     */
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int pos = str.indexOf("hi");
        return pos == -1 ? 0 : 1 + countHi(str.substring(pos + 2));
    }

    /**
     * codingbat.com/prob/p101372
     *
     * @param str a string
     * @return each 'x' changed to 'y'
     */
    public static String changeXY(String str) {
        int pos;
        if (str.isEmpty() || (pos = str.indexOf('x')) == -1) {
            return str;
        }

        return str.substring(0, pos) + 'y' + changeXY(str.substring(pos + 1));
    }

    /**
     * codingbat.com/prob/p118230
     *
     * @param str a string
     * @return all 'x' removed
     */
    public static String noX(String str) {
        int pos;
        if (str.isEmpty() || (pos = str.indexOf('x')) == -1) {
            return str;
        }

        return str.substring(0, pos) + noX(str.substring(pos + 1));
    }
}
