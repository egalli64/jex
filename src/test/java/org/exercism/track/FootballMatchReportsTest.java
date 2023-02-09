/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Football Match Reports: exercism.org/tracks/java/exercises/football-match-reports
 */
class FootballMatchReportsTest {
    @Test
    void onFieldGoalie() {
        Assertions.assertThat(FootballMatchReports.onField(1)).isEqualTo("goalie");
    }

    @Test
    void onFieldMissing() {
        Assertions.assertThatIllegalArgumentException() //
                .isThrownBy(() -> System.out.println(FootballMatchReports.onField(42)));
    }
}