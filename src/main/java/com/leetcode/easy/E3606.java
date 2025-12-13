/*
 * 3606. Coupon Code Validator
 * https://leetcode.com/problems/coupon-code-validator/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Filter the valid coupons
 * - code should be non-empty, with only alphanumeric chars and underscore in it
 * - the only business lines accepted are: electronics, grocery, pharmacy, restaurant
 * - it should be active
 * <p>
 * Sort them by business line + code, and return just the codes.
 * <p>
 * Assume all the components are "good" (strings could be empty, though)
 */
public class E3606 {
    /**
     * Smoke test
     */
    static void main() {
        E3606 x = new E3606();
        System.out.println(x.validateCoupons(
                new String[]{"SAVE20", "", "PHARMA5", "SAVE@20"},
                new String[]{"restaurant", "grocery", "pharmacy", "restaurant"},
                new boolean[]{true, true, true, true})
                + " == [PHARMA5, SAVE20]"
        );
        System.out.println(x.validateCoupons(
                new String[]{"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"},
                new String[]{"grocery", "electronics", "invalid"},
                new boolean[]{false, true, true})
                + " == [ELECTRONICS_50]"
        );
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> coupons = new ArrayList<>(code.length);
        for (int i = 0; i < code.length; i++) {
            coupons.add(new Coupon(code[i], businessLine[i], isActive[i]));
        }

        return coupons.stream().filter(Coupon::isValid).sorted().map(x -> x.code).toList();
    }

    private record Coupon(String code, String line, boolean active) implements Comparable<Coupon> {
        private static final Pattern VALID_CODE = Pattern.compile("^[A-Za-z0-9_]+$");
        private static final Set<String> VALID_LINES = Set.of("electronics", "grocery", "pharmacy", "restaurant");
        private static final Comparator<Coupon> ORDER = Comparator.comparing(Coupon::line).thenComparing(Coupon::code);

        boolean isValid() {
            return VALID_CODE.matcher(code).matches() && VALID_LINES.contains(line) && active;
        }

        @Override
        public int compareTo(Coupon other) {
            return ORDER.compare(this, other);
        }
    }
}
