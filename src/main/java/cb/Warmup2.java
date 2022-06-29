/**
 * https://codingbat.com/java/Warmup-2
 */
package cb;

public class Warmup2 {
    public static String stringTimes11(String str, int n) {
        return str.repeat(n);
    }

    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
