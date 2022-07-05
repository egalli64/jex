/**
 * https://codingbat.com/java/String-3
 */
package cb;

public class String3 {
    /**
     * codingbat.com/prob/p199171
     *
     * @param str a non-empty string
     * @return how many case-insensitive y,z are at the end of words in the string
     */
    public static int countYZ(String str) {
        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char current = Character.toUpperCase(str.charAt(i));
            if ((current == 'Y' || current == 'Z') && !Character.isLetter(str.charAt(i + 1))) {
                result += 1;
            }
        }

        char last = Character.toUpperCase(str.charAt(str.length() - 1));
        if (last == 'Y' || last == 'Z') {
            result += 1;
        }

        return result;
    }

    /**
     * codingbat.com/prob/p198664
     *
     * @param str a string
     * @return true if there is no isolated g in the string
     */
    public static boolean gHappy(String str) {
        if (str.isEmpty()) {
            return true;
        }

        if (str.length() == 1) {
            return str.charAt(0) != 'g';
        }

        if (str.charAt(0) == 'g' && str.charAt(1) != 'g') {
            return false;
        }

        if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
            return false;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }

        return true;
    }

    /**
     * codingbat.com/prob/p131516
     *
     * @param string a string
     * @return the longest matching substring at the beginning and end of the string
     */
    public static String sameEnds(String string) {
        StringBuilder result = new StringBuilder(string.substring(0, string.length() / 2));

        while (result.length() > 0) {
            String current = result.toString();
            if (string.endsWith(current)) {
                break;
            } else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p192570
     *
     * @param base a string
     * @param remove a non-empty string to be removed
     * @return a copy of base without any remove (case-insensitive!) in it
     */
    public static String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    /**
     * codingbat.com/prob/p195714
     *
     * @param str a string
     * @return how many (possibly overlapping) same char triplet are in the string
     */
    public static int countTriple(String str) {
        int result = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p139411
     *
     * @param string a string
     * @return the longest palindromic section of the string
     */
    public static String mirrorEnds(String string) {
        int i = 0;
        for(int j = string.length() - 1; i < j; i++, j--) {
            if(string.charAt(i) != string.charAt(j)) {
                break;
            }
        }
        return i == string.length() / 2 ? string : string.substring(0, i);
    }
}
