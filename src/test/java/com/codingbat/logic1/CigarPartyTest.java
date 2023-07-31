/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CigarPartyTest {
    @ParameterizedTest
    @CsvSource({ "30,false,false", "50,false,true", "70,true,true" })
    void solutionExamples(int cigars, boolean isWeekend, boolean expected) {
        assertThat(CigarParty.solution(cigars, isWeekend)).isEqualTo(expected);
    }
}
