/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * monkeyTrouble - codingbat.com/prob/p181646
 * 
 * My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MonkeyTroubleTest {
    @ParameterizedTest
    @CsvSource({ "true, true, true", "false, false, true", "true, false, false" })
    void plainExamples(boolean a, boolean b, boolean expected) {
        assertThat(MonkeyTrouble.plain(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "true, true, true", "false, false, true", "true, false, false" })
    void verboseExamples(boolean a, boolean b, boolean expected) {
        assertThat(MonkeyTrouble.verbose(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "true, true, true", "false, false, true", "true, false, false" })
    void obscureExamples(boolean a, boolean b, boolean expected) {
        assertThat(MonkeyTrouble.obscure(a, b)).isEqualTo(expected);
    }
}
