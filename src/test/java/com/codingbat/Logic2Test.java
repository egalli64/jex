package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic2Test {
    @ParameterizedTest
    @CsvSource({ "2,4,6,true", "4,6,2,true", "4,6,3,false" })
    void evenlySpacedExamples(int first, int second, int third, boolean expected) {
        assertThat(Logic2.evenlySpaced(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "4, 1, 9, 4", "4, 1, 10, -1", "4, 1, 7, 2" })
    void makeChocolateExamples(int small, int big, int target, int expected) {
        assertThat(Logic2.makeChocolate(small, big, target)).isEqualTo(expected);
    }
}