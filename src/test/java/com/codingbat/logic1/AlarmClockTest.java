package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AlarmClockTest {
    @ParameterizedTest
    @CsvSource({ "1,false,7:00", "5,false,7:00", "0,false,10:00" })
    void alarmClockExamples(int temp, boolean summer, String expected) {
        assertThat(AlarmClock.solution(temp, summer)).isEqualTo(expected);
    }
}
