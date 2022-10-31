package com.hackerrank.algorithms.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FlippingBitsTest {
    @ParameterizedTest
    @CsvSource({"9,4294967286", "2147483647,2147483648", "1,4294967294", "0,4294967295"})
    void flippingBitsSample0(long input, long expected) {
        long actual = FlippingBits.flippingBits(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}