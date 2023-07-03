/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Front3Test {
    @ParameterizedTest
    @CsvSource({ "Java,JavJavJav", "Chocolate,ChoChoCho", "abc,abcabcabc" })
    void solutionExamples(String input, String expected) {
        assertThat(Front3.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Java,JavJavJav", "Chocolate,ChoChoCho", "abc,abcabcabc" })
    void solutionJ11Examples(String input, String expected) {
        assertThat(Front3.solutionJ11(input)).isEqualTo(expected);
    }
}
