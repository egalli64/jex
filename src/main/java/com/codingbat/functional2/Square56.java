/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import static java.util.function.Predicate.not;
import java.util.stream.Collectors;

/**
 * square56 - https://codingbat.com/prob/p132748
 * <p>
 * Square each integer in the input list, add ten to each one, but drop any
 * element that, after appending, ends by 5 or 6 (base 10)
 */
public class Square56 {
    /**
     * Follow step by step the requirements as given (generating a new list)
     * <p>
     * Stream the input list; map each value as specified; filter to keep just the
     * required values; collect them to a new list
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x * x + 10).filter(Square56::notEndsBy56).collect(Collectors.toList());
    }

    /**
     * Implementation detail to simplify filtering in stream
     * 
     * @param x a _positive_ integer
     * @return true if the passed integer does not end by 5 or 6
     */
    private static boolean notEndsBy56(int x) {
        int last = x % 10;
        return last < 5 || last > 6;
    }

    /**
     * Improved algorithm: filter first, keeping the values that, when squared, are
     * still good; then map (generating a new list)
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> alternative(List<Integer> nums) {
        return nums.stream().filter(Square56::notEndingBy456).map(x -> x * x + 10).collect(Collectors.toList());
    }

    /**
     * Implementation detail to simplify filtering
     * <p>
     * Check the last digit of the passed integer against 4, 5, 6
     * <p>
     * Since the passed integer could be negative, use Math::floorMod or Math::abs
     * on the result of the % operator.
     * 
     * @param x an integer
     * @return true if the passed integer does not end by [4..6]
     * @apiNote requires 8+ for Math::floorMod
     */
    private static boolean notEndingBy456(int x) {
        int last = Math.floorMod(x, 10);
        return last < 4 || last > 6;
    }

    /**
     * In-place version of the improved algorithm
     * <p>
     * In the passed list, drop the numbers having 4, 5, or 6 as last digit (when
     * squared their last digit is 5 or 6); then apply the required transformation
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(Square56::endsBy456);
        nums.replaceAll(x -> x * x + 10);
        return nums;
    }

    /**
     * Implementation detail to simplify filtering
     * <p>
     * Check the last digit of the passed integer against 4, 5, 6
     * <p>
     * Since the passed integer could be negative, use Math::floorMod (or Math::abs
     * on the result of the % operator)
     * 
     * @param x an integer
     * @return true if the passed integer ends by [4..6]
     * @apiNote requires 8+ for Math::floorMod
     */
    private static boolean endsBy456(int x) {
        int last = Math.floorMod(x, 10);
        return last >= 4 && last <= 6;
    }

    /**
     * Improved algorithm with modern Java features (currently not supported by
     * CodingBat)
     *
     * @param nums a list
     * @return the filtered list
     * @apiNote requires 16+ for Stream::toList
     * @apiNote requires 11+ for Predicate::not
     */
    public static List<Integer> compactModern(List<Integer> nums) {
        return nums.stream().filter(not(Square56::endsBy456)).map(x -> x * x + 10).toList();
    }
}
