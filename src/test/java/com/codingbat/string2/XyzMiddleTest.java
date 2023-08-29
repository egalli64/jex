/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class XyzMiddleTest {
    @ParameterizedTest
    @CsvSource({ "AAxyzBB,true", "AxyzBB,true", "AxyzBBB,false", "AAAxyzB,false" })
    void solutionExamples(String input, boolean expected) {
        assertThat(XyzMiddle.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "AAxyzBB,true", "AxyzBB,true", "AxyzBBB,false", "AAAxyzB,false" })
    void byIndexExamples(String input, boolean expected) {
        assertThat(XyzMiddle.byIndex(input)).isEqualTo(expected);
    }

    @Test
    void checkXyzOutOfBound() {
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class) //
                .isThrownBy(() -> XyzMiddle.isCenteredXyz("xyz", 0));
    }

    @ParameterizedTest
    @CsvSource({ "AAxyzBB,3,true", "AxyzBB,2,true", "AxyzBBB,1,false", "AAAxyzB,3,false" })
    void isCenteredXyzExamples(String input, int index, boolean expected) {
        assertThat(XyzMiddle.isCenteredXyz(input, index)).isEqualTo(expected);
    }
}
