package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String3Test {
    @ParameterizedTest
    @CsvSource({ "is test,is not test", "is-is,is not-is not", "This is right,This is not right" })
    void notReplaceExamples(String s, String expected) {
        assertThat(String3.notReplace(s)).isEqualTo(expected);
    }
}