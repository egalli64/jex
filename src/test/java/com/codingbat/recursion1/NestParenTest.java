/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NestParenTest {
    @ParameterizedTest
    @CsvSource({ "(()),true", "((())),true", "(((x)),false" })
    void nestParenExamples(String input, boolean expected) {
        assertThat(NestParen.nestParen(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "(()),true", "((())),true", "(((x)),false" })
    void tailRecExamples(String input, boolean expected) {
        assertThat(NestParen.tailRec(input)).isEqualTo(expected);
    }
}
