/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PlusOutTest {
    @ParameterizedTest
    @CsvSource({ "12xy34,xy,++xy++", "12xy34,1,1+++++", "12xy34xyabcxy,xy,++xy++xy+++xy" })
    void plusOutExamples(String s, String w, String expected) {
        assertThat(PlusOut.solution(s, w)).isEqualTo(expected);
    }
}
