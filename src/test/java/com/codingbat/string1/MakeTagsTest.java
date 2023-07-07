/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeTagsTest {
    @ParameterizedTest
    @CsvSource({ "i,Yay,<i>Yay</i>", "i,Hello,<i>Hello</i>", "cite,Yay,<cite>Yay</cite>" })
    void makeTagsExamples(String tag, String content, String expected) {
        assertThat(MakeTags.solution(tag, content)).isEqualTo(expected);
    }
}
