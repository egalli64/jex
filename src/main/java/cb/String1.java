/**
 * https://codingbat.com/java/String-1
 */
package cb;

public class String1 {
    /**
     * codingbat.com/prob/p171896
     *
     * @param name a string representing a name
     * @return "Hello <name>!"
     */
    public static String helloName(String name) {
        return "Hello " + name + '!';
    }

    /**
     * codingbat.com/prob/p184030
     *
     * @param out  a 4-char template in which word has to be inserted
     * @param word a string to be inserted in the middle of the "out" template
     * @return the combination of out and word
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    /**
     * codingbat.com/prob/p172267
     *
     * @param str a string even sized
     * @return the str first half
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * codingbat.com/prob/p143825
     *
     * @param a a non-empty string
     * @param b a non-empty string
     * @return a concatenation of the two input strings, but their first char
     */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /**
     * codingbat.com/prob/p162477
     *
     * @param str   a non-empty string
     * @param front true for begin, false for end
     * @return a string containing just the first or last char from input
     */
    public static String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     * codingbat.com/prob/p103895
     *
     * @param str a possibly empty string
     * @return true if it ends in "ly"
     */
    public static boolean endsLy(String str) {
        int len = str.length();
        return len > 1 && str.charAt(len - 2) == 'l' && str.charAt(len - 1) == 'y';
    }

    /**
     * codingbat.com/prob/p115863
     * 
     * @param str a string of odd length, at least 3
     * @return the three central chars as string
     */
    public static String middleThree(String str) {
        int begin = str.length() / 2 - 1;
        return str.substring(begin, begin + 3);
    }

    /**
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return two char string, first of a + last of b (@ if missing)
     */
    public static String lastChars(String a, String b) {
        StringBuilder result = new StringBuilder();
        result.append(a.isEmpty() ? '@' : a.charAt(0));
        result.append(b.isEmpty() ? '@' : b.charAt(b.length() - 1));
        return result.toString();
    }

    /**
     * codingbat.com/prob/p199216
     * 
     * @param str a possibly empty string
     * @return "red", "blue", or "", accordingly to the starting tag
     */
    public static String seeColor(String str) {
        String[] tags = { "red", "blue" };
        for (String tag : tags) {
            if (str.startsWith(tag)) {
                return tag;
            }
        }
        return "";
    }

    /**
     * codingbat.com/prob/p172063
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String extraFront(String str) {
        int end = Math.min(str.length(), 2);
        String tag = str.substring(0, end);
        StringBuilder result = new StringBuilder(tag);
        for (int i = 0; i < 2; i++) {
            result.append(tag);
        }
        return result.toString();
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String extraFront11(String str) {
        int end = Math.min(str.length(), 2);
        return str.substring(0, end).repeat(3);
    }

    /**
     * codingbat.com/prob/p141494
     * 
     * @param str  a non-empty string
     * @param word a non-empty checking string
     * @return the start of str if matches with word (first char excluded)
     *         <li>empty string otherwise
     */
    public static String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        String tag = str.substring(0, word.length());
        return tag.substring(1).equals(word.substring(1)) ? tag : "";
    }

    /**
     * codingbat.com/prob/p161056
     * 
     * @param a first string
     * @param b second string
     * @return first + second + second + first
     */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * codingbat.com/prob/p147483
     * 
     * @param tag  the tag name
     * @param word the element content
     * @return the element
     */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /**
     * codingbat.com/prob/p108853
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String extraEnd(String str) {
        String tag = str.substring(str.length() - 2);
        StringBuilder result = new StringBuilder(tag);
        for (int i = 0; i < 2; i++) {
            result.append(tag);
        }
        return result.toString();
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String extraEnd11(String str) {
        return str.substring(str.length() - 2).repeat(3);
    }

    /**
     * codingbat.com/prob/p163411
     * 
     * @param str a possibly empty string
     * @return the first two chars (when available) as string
     */
    public static String firstTwo(String str) {
        return str.substring(0, Math.min(str.length(), 2));
    }

    /**
     * codingbat.com/prob/p130896
     * 
     * @param str a string sized at least 2
     * @return removed first and last
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * codingbat.com/prob/p168564
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty, differently sized
     * @return short+long+short
     */
    public static String comboString(String a, String b) {
        String shortOne = a.length() < b.length() ? a : b;
        String longOne = a.length() > b.length() ? a : b;
        return shortOne + longOne + shortOne;
    }

    /**
     * codingbat.com/prob/p197720
     * 
     * @param str a string sized 2+
     * @return the first 2 chars moved to the end
     */
    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * codingbat.com/prob/p130781
     * 
     * @param str a string sized 2+
     * @return the last 2 chars moved to the begin
     */
    public static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * codingbat.com/prob/p174254
     * 
     * @param str a possibly empty string
     * @return cut first and last, when available
     */
    public static String withouEnd2(String str) {
        return (str.length() < 3) ? "" : str.substring(1, str.length() - 1);
    }

    /**
     * codingbat.com/prob/p137729
     * 
     * @param str a string of even length, 2+
     * @return the middle two chars
     */
    public static String middleTwo(String str) {
        final int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }

    /**
     * codingbat.com/prob/p174148
     * 
     * @param str a string size n+
     * @param n   a non-negative integer
     * @return the first and last n chars
     */
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * codingbat.com/prob/p144623
     * 
     * @param str   a string sized 2+
     * @param index an integer
     * @return a string length 2 from the given index, or the first 2 chars
     */
    public static String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            index = 0;
        }
        return str.substring(index, index + 2);
    }

    /**
     * codingbat.com/prob/p139075
     * 
     * @param str a possibly empty string
     * @return true if "bad" is @ pos 0 or 1
     */
    public static boolean hasBad(String str) {
        return str.lastIndexOf("bad", 1) > -1;
    }

    /**
     * codingbat.com/prob/p139076
     * 
     * @param str a possibly empty string
     * @return first 2 chars, padded with '@' when too short
     */
    public static String atFirst(String str) {
        int len = Math.min(str.length(), 2);
        StringBuilder result = new StringBuilder(str.substring(0, len));
        for (int i = len; i < 2; i++) {
            result.append('@');
        }
        return result.toString();
    }

    /**
     * codingbat.com/prob/p132118
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return concatenated string, but no dup for last1/first2 char
     */
    public static String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty() || a.charAt(a.length() - 1) != b.charAt(0)) {
            return a + b;
        }
        return a + b.substring(1);
    }

    /**
     * codingbat.com/prob/p194786
     * 
     * @param str a possibly empty string
     * @return last two chars, if available, swapped
     */
    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }
}
