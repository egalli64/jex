package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DoubleCharTest {
    @ParameterizedTest
    @CsvSource({ "The,TThhee", "AAbb,AAAAbbbb", "Hi-There,HHii--TThheerree" })
    void doubleCharExamples(String input, String expected) {
        assertThat(DoubleChar.solution(input)).isEqualTo(expected);
    }
}
