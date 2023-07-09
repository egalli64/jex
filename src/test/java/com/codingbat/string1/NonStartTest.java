/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NonStartTest {
    @ParameterizedTest
    @CsvSource({ "Hello,There,ellohere", "java,code,avaode", "shotl,java,hotlava" })
    void nonStartExamples(String left, String right, String expected) {
        assertThat(NonStart.solution(left, right)).isEqualTo(expected);
    }
}
