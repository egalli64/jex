package com.hackerrank.algorithms.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumVsXORTest {
    @ParameterizedTest
    @CsvSource({"4,4", "5,2", "10,4"})
    void sumXorSamples(long input, long expected) {
        long actual = SumVsXOR.sumXor(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"4,4", "5,2", "10,4"})
    void sumXorPlainSamples(long input, long expected) {
        long actual = SumVsXOR.sumXorNaive(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}