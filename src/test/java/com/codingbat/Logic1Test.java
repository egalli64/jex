package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic1Test {
    @ParameterizedTest
    @CsvSource({ "23, 19, 13, true", "23, 19, 12, false", "23, 19, 3, true" })
    void lastDigitExamples(int a, int b, int c, boolean expected) {
        assertThat(Logic1.lastDigit(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,3,3", "6,2,6", "3,2,3" })
    void maxMod5Examples(int a, int b, int expected) {
        assertThat(Logic1.maxMod5(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 4, false, true", "1, 2, 1, false, false", "1, 1, 2, true, true" })
    void inOrderExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(Logic1.inOrder(a, b, c, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 5, 11, false, true", "5, 7, 6, false, false", "5, 5, 7, true, true" })
    void inOrderEqualExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(Logic1.inOrderEqual(a, b, c, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 7, 11, true", "1, 7, 10, false", "11, 1, 7, true" })
    void lessBy10Examples(int a, int b, int c, boolean expected) {
        assertThat(Logic1.lessBy10(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,3,true,5", "3,3,true,7", "3,3,false,6" })
    void withoutDoublesExamples(int a, int b, boolean change, int expected) {
        assertThat(Logic1.withoutDoubles(a, b, change)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 2, 2, 10", "2, 2, 1, 0", "0, 0, 0, 5" })
    void redTicketExamples(int a, int b, int c, int expected) {
        assertThat(Logic1.redTicket(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 0", "2, 2, 2, 20", "1, 1, 2, 10" })
    void greenTicketExamples(int a, int b, int c, int expected) {
        assertThat(Logic1.greenTicket(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "9, 1, 0, 10", "9, 2, 0, 0", "6, 1, 4, 10" })
    void blueTicketExamples(int a, int b, int c, int expected) {
        assertThat(Logic1.blueTicket(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12, 23, true", "12, 43, false", "12, 44, false" })
    void shareDigitExamples(int first, int second, boolean expected) {
        assertThat(Logic1.shareDigit(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 3, 5", "8, 3, 8", "8, 1, 9" })
    void sumLimitExamples(int a, int b, int expected) {
        assertThat(Logic1.sumLimit(a, b)).isEqualTo(expected);
    }
}