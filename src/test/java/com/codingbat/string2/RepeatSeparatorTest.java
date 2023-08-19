/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RepeatSeparatorTest {
    @ParameterizedTest
    @CsvSource({ "Word,X,3,WordXWordXWord", "This,And,2,ThisAndThis", "This,And,1,This" })
    void solutionExamples(String word, String separator, int n, String expected) {
        assertThat(RepeatSeparator.solution(word, separator, n)).isEqualTo(expected);
    }
}
