/**
 * https://codingbat.com/java/Functional-1
 */
package cb;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    /**
     * codingbat.com/prob/p117665
     *
     * @param nums a list
     * @return list with doubled values
     */
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(x -> x * 2);
        return nums;
    }

    /**
     * codingbat.com/prob/p181634
     * <p>
     * Java 11 not supported by CodingBat, see {@linkplain Functional1#copies3(List)}
     *
     * @param strings a string list
     * @return each string tripled
     */
    public static List<String> copies3Java11(List<String> strings) {
        strings.replaceAll(x -> x.repeat(3));
        return strings;
    }

    /**
     * codingbat.com/prob/p181634
     *
     * @param strings a string list
     * @return each string tripled
     */
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(x -> x + x + x);
        return strings;
    }

    /**
     * codingbat.com/prob/p152194
     *
     * @param nums a int list of non-negative numbers
     * @return for each number just the rightmost decimal cipher is kept
     */
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(x -> x % 10);
        return nums;
    }

    /**
     * Variation to {@linkplain Functional1#rightDigit(List)}, new list is generated and returned
     *
     * @param nums a int list of non-negative numbers
     * @return for each number just the rightmost decimal cipher is kept
     */
    public static List<Integer> rightDigitOther(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p139586
     * 
     * @param nums integers
     * @return each value squared
     */
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(x -> x * x);
        return nums;
    }

    /**
     * Variation to {@linkplain Functional1#square(List)}, new list is generated and returned
     * 
     * @param nums integers
     * @return each value squared
     */
    public static List<Integer> squareByMapping(List<Integer> nums) {
        return nums.stream().map(x -> x * x).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p170181
     * 
     * @param strings a list
     * @return each string with a '*' in the end
     */
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(x -> x + '*');
        return strings;
    }

    /**
     * codingbat.com/prob/p177528
     * 
     * @param strings a list
     * @return each string prefixed and postfixed by 'y'
     */
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(x -> 'y' + x + 'y');
        return strings;
    }
}
