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

    /**
     * codingbat.com/prob/p108997
     *
     * @param nums  an array
     * @param index non-negative, from this position on
     * @return true if contains 6
     */
    public static boolean array6(int[] nums, int index) {
        if (index > nums.length - 1) {
            return false;
        }
        return nums[index] == 6 || array6(nums, index + 1);
    }

    /**
     * codingbat.com/prob/p173469
     *
     * @param nums  an array
     * @param index non-negative, from this position on
     * @return true if next value is 10x current one
     */
    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        } else if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);
    }

    /**
     * codingbat.com/prob/p183394
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }
        return allStar(new StringBuilder(str), 1).toString();
    }

    /**
     * Helper for {@linkplain Recursion1#allStar(String)}
     *
     * @param sb  a mutable string
     * @param pos current position for '*' insertion
     * @return the starred string
     */
    private static StringBuilder allStar(StringBuilder sb, int pos) {
        if (pos > sb.length() - 1) {
            return sb;
        }
        sb.insert(pos, '*');
        return allStar(sb, pos + 2);
    }

    /**
     * codingbat.com/prob/p158175
     *
     * @param str a string
     * @return all same-char couple connected by '*'
     */
    public static String pairStar(String str) {
        return str.length() < 2 ? str : pairStar(new StringBuilder(str), 1).toString();
    }

    /**
     * Helper for {@linkplain Recursion1#pairStar(String)}
     *
     * @param sb a mutable string
     * @param i  current position to be checked for '*' insertion
     * @return the starred string
     */
    private static StringBuilder pairStar(StringBuilder sb, int i) {
        if (i == sb.length()) {
            return sb;
        }
        if (sb.charAt(i) == sb.charAt(i - 1)) {
            sb.insert(i, '*');
        }
        return pairStar(sb, i + 1);
    }

    /**
     * codingbat.com/prob/p105722
     *
     * @param str a string
     * @return all 'x' moved to the end
     */
    public static String endX(String str) {
        int last = lastNotX(str, str.length() - 1);
        return last > 0 ? endX(new StringBuilder(str), 0, last).toString() : str;
    }

    /**
     * Helper for {@linkplain Recursion1#endX(String)}
     *
     * @param s string
     * @param i right position
     * @return the position of the last non-x char
     */
    private static int lastNotX(String s, int i) {
        return i < 1 || s.charAt(i) != 'x' ? i : lastNotX(s, i - 1);
    }

    /**
     * Helper for {@linkplain Recursion1#endX(String)}
     *
     * @param sb   a mutable string
     * @param cur  the position to be checked
     * @param last the last position to be checked
     * @return mutable string rearranged
     */
    private static StringBuilder endX(StringBuilder sb, int cur, int last) {
        if (cur > last) {
            return sb;
        }
        if (sb.charAt(cur) == 'x') {
            sb.deleteCharAt(cur);
            sb.append('x');
            last -= 1;
        } else {
            cur += 1;
        }
        return endX(sb, cur, last);
    }

    /**
     * codingbat.com/prob/p154048
     *
     * @param str a string
     * @return the number of same chars separated by one other char
     */
    public static int countPairs(String str) {
        return str.length() < 3 ? 0 : countPairs(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#countPairs(String)}
     *
     * @param str a string
     * @param i   starting position
     * @return the number of same chars separated by one other char
     */
    private static int countPairs(String str, int i) {
        if (i > str.length() - 3) {
            return 0;
        }
        return (str.charAt(i) == str.charAt(i + 2) ? 1 : 0) + countPairs(str, i + 1);
    }

    /**
     * codingbat.com/prob/p161124
     *
     * @param str a string
     * @return number of sub "abc" and "aba"
     */
    public static int countAbc(String str) {
        return countAbc(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#countAbc(String)}
     *
     * @param s a string
     * @param i a position
     * @return number of sub "abc" and "aba" from i
     */
    private static int countAbc(String s, int i) {
        if (i > s.length() - 3) {
            return 0;
        }
        return (isAbaOrAbc(s, i) ? 1 : 0) + countAbc(s, i + 1);
    }

    /**
     * Helper for {@linkplain Recursion1#countAbc(String)}
     *
     * @param s a string
     * @param i a position
     * @return true if s from i is "abc" or "aba"
     */
    private static boolean isAbaOrAbc(String s, int i) {
        char last = s.charAt(i + 2);
        return s.charAt(i) == 'a' && s.charAt(i + 1) == 'b' && (last == 'a' || last == 'c');
    }

    /**
     * codingbat.com/prob/p167015
     *
     * @param str a string
     * @return number of non-overlapping substring "11"
     */
    public static int count11(String str) {
        return count11(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#count11(String)}
     *
     * @param s a string
     * @param i from this position
     * @return number of non-overlapping substring "11"
     */
    private static int count11(String s, int i) {
        if (i > s.length() - 2) {
            return 0;
        }
        if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
            return 1 + count11(s, i + 2);
        } else {
            return count11(s, i + 1);
        }
    }

    /**
     * codingbat.com/prob/p104029
     *
     * @param str a string
     * @return no double chars left
     */
    public static String stringClean(String str) {
        return stringClean(new StringBuilder(str), 0).toString();
    }

    /**
     * Helper for {@linkplain Recursion1#stringClean(String)}
     *
     * @param sb a mutable string
     * @param i  current position
     * @return no double chars from i on
     */
    private static StringBuilder stringClean(StringBuilder sb, int i) {
        if (i > sb.length() - 2) {
            return sb;
        }
        if (sb.charAt(i) == sb.charAt(i + 1)) {
            sb.deleteCharAt(i + 1);
            return stringClean(sb, i);
        }
        return stringClean(sb, i + 1);
    }

    /**
     * codingbat.com/prob/p143900
     *
     * @param str a string
     * @return count of "hi" not prefixed by 'x'
     */
    public static int countHi2(String str) {
        return countHi2(str, 0);
    }

    /**
     * Helper for {@linkplain Recursion1#countHi2(String)}
     *
     * @param s a string
     * @param i a position
     * @return count of "hi" not prefixed by 'x' from i on
     */
    private static int countHi2(String s, int i) {
        if (i > s.length() - 2) {
            return 0;
        }
        if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
            return 1 + countHi2(s, i + 1);
        } else if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'h') {
            return countHi2(s, i + 2);
        } else {
            return countHi2(s, i + 1);
        }
    }

    /**
     * codingbat.com/prob/p137918
     *
     * @param str a string inf format "...(...)..."
     * @return the substring delimited by '(' and ')'
     */
    public static String parenBit(String str) {
        return str.substring(firstParenLeft(str, 0), lastParenRight(str, str.length() - 1) + 1);
    }

    /**
     * Helper for {@linkplain Recursion1#parenBit(String)}
     *
     * @param s string
     * @param i position
     * @return the first '(' from i
     */
    private static int firstParenLeft(String s, int i) {
        if (s.charAt(i) == '(') {
            return i;
        }
        return firstParenLeft(s, i + 1);
    }

    /**
     * Helper for {@linkplain Recursion1#parenBit(String)}
     *
     * @param s string
     * @param i position
     * @return the last ')' up to i
     */
    private static int lastParenRight(String s, int i) {
        if (s.charAt(i) == ')') {
            return i;
        }
        return lastParenRight(s, i - 1);
    }

    /**
     * codingbat.com/prob/p183174
     *
     * @param str a string
     * @return true if matching open/close parenthesis
     */
    public static boolean nestParen(String str) {
        return nestParen(str, 0, str.length() - 1);
    }

    /**
     * Helper for {@linkplain Recursion1#nestParen(String)}
     *
     * @param s string
     * @param i left pos
     * @param j right pos
     * @return true if all matching from current in
     */
    private static boolean nestParen(String s, int i, int j) {
        if (i > j) {
            return true;
        }
        if (s.charAt(i) != '(' || s.charAt(j) != ')') {
            return false;
        }
        return nestParen(s, i + 1, j - 1);
    }

    /**
     * codingbat.com/prob/p186177
     *
     * @param str string
     * @param sub non-empty
     * @return count non overlapping sub in str
     */
    public static int strCount(String str, String sub) {
        return strCount(str, 0, sub);
    }

    /**
     * Helper for {@linkplain Recursion1#strCount(String, String)}
     *
     * @param str string
     * @param i   from position
     * @param sub non-empty
     * @return count non overlapping sub in str from i on
     */
    private static int strCount(String str, int i, String sub) {
        if (str.length() - i < sub.length()) {
            return 0;
        }
        if (isMatching(str, i, sub, 0)) {
            return 1 + strCount(str, i + sub.length(), sub);
        } else {
            return strCount(str, i + 1, sub);
        }
    }

    /**
     * Helper for {@linkplain Recursion1#strCount(String, String)}
     *
     * @param str string
     * @param i   start position in str
     * @param sub substring
     * @param j   start position in sub
     * @return true if str and sub match from i, j on
     */
    private static boolean isMatching(String str, int i, String sub, int j) {
        if (j == sub.length()) {
            return true;
        }
        if (str.charAt(i) != sub.charAt(j)) {
            return false;
        }
        return isMatching(str, i + 1, sub, j + 1);
    }
}
