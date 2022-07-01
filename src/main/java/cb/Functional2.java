/**
 * https://codingbat.com/java/Functional-2
 */
package cb;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    /**
     * codingbat.com/prob/p103456
     *
     * @param nums a list
     * @return just the non-negative numbers
     */
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(x -> x >= 0).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p105671
     *
     * @param strings a list
     * @return only strings without 'z'
     */
    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(x -> !x.contains("z")).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p115967
     *
     * @param strings a string list
     * @return each string has a "y" added at the end, but strings containing "yy" are discarded
     */
    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(x -> x + "y").filter(x -> !x.contains("yy")).collect(Collectors.toList());
    }
}
