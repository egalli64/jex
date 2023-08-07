/**
 * https://codingbat.com/java/Recursion-1
 */
package com.codingbat;

public class Recursion1 {
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
     * Helper for {@linkplain Recursion1#strCount(String, String)},
     * {@linkplain Recursion1#strCopies(String, String, int)}, and
     * {@linkplain Recursion1#strDist(String, String)}
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

    /**
     * codingbat.com/prob/p118182
     *
     * @param str string
     * @param sub non-empty
     * @param n   non-negative, number of copies
     * @return true if there are the required n (overlapping) copies
     */
    public static boolean strCopies(String str, String sub, int n) {
        return strCopies(str, 0, sub) == n;
    }

    /**
     * Helper for {@linkplain Recursion1#strCopies(String, String, int)}
     *
     * @param str string
     * @param i   start position
     * @param sub non-empty
     * @return count sub in str from i
     */
    private static int strCopies(String str, int i, String sub) {
        if (str.length() - i < sub.length()) {
            return 0;
        }
        return (isMatching(str, i, sub, 0) ? 1 : 0) + strCopies(str, i + 1, sub);
    }

    /**
     * codingbat.com/prob/p195413
     *
     * @param str string
     * @param sub non-empty
     * @return size of the largest substring starting and ending by sub
     */
    public static int strDist(String str, String sub) {
        int begin = firstSubLeft(str, 0, sub);
        if (begin == -1) {
            return 0;
        }

        int end = lastSubRight(str, str.length() - sub.length(), sub) + sub.length();
        return end - begin;
    }

    /**
     * Helper for {@linkplain Recursion1#strDist(String, String)}
     *
     * @param s string
     * @param i position
     * @return the first '(' from i
     */
    private static int firstSubLeft(String s, int i, String sub) {
        if (i + sub.length() > s.length()) {
            return -1;
        }
        if (isMatching(s, i, sub, 0)) {
            return i;
        }
        return firstSubLeft(s, i + 1, sub);
    }

    /**
     * Helper for {@linkplain Recursion1#strDist(String, String)}
     *
     * @param s string
     * @param i position
     * @return the last ')' up to i
     */
    private static int lastSubRight(String s, int i, String sub) {
        if (i < 0) {
            return -1;
        }
        if (isMatching(s, i, sub, 0)) {
            return i;
        }
        return lastSubRight(s, i - 1, sub);
    }
}
