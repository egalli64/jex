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
}
