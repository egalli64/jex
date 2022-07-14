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
}
