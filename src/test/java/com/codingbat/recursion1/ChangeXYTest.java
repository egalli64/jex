/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChangeXYTest {
    @ParameterizedTest
    @CsvSource({ "codex,codey", "xxhixx,yyhiyy", "xhixhix,yhiyhiy" })
    void changeXYExamples(String input, String expected) {
        assertThat(ChangeXY.changeXY(input)).isEqualTo(expected);
    }
}
