/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParenBitTest {
    @ParameterizedTest
    @CsvSource({ "xyz(abc)123,(abc)", "x(hello),(hello)", "(xy)1,(xy)" })
    void parenBitExamples(String input, String expected) {
        assertThat(ParenBit.parenBit(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xyz(abc)123,(abc)", "x(hello),(hello)", "(xy)1,(xy)" })
    void tailRecExamples(String input, String expected) {
        assertThat(ParenBit.tailRec(input)).isEqualTo(expected);
    }
}
