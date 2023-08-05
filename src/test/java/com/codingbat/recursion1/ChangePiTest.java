/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChangePiTest {
    @ParameterizedTest
    @CsvSource({"xpix,x3.14x", "pipi,3.143.14", "pip,3.14p"})
    void changePiExamples(String input, String expected) {
        assertThat(ChangePi.changePi(input)).isEqualTo(expected);
    }
}
