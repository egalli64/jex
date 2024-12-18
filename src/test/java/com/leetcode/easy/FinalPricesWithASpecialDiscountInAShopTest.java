/*
 * 1475. Final Prices With a Special Discount in a Shop - https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FinalPricesWithASpecialDiscountInAShopTest {
    private static final FinalPricesWithASpecialDiscountInAShop instance = new FinalPricesWithASpecialDiscountInAShop();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 8, 7, 4, 2, 8, 1, 7, 7, 10, 1 }, new int[] { 1, 3, 2, 1, 7, 0, 0, 6, 9, 1 }), //
                Arguments.of(new int[] { 8, 4, 6, 2, 3 }, new int[] { 4, 2, 4, 2, 3 }), //
                Arguments.of(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 }), //
                Arguments.of(new int[] { 10, 1, 1, 6 }, new int[] { 9, 0, 1, 6 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        int[] actual = instance.finalPrices(input);
        assertThat(actual).isEqualTo(expected);
    }
}
