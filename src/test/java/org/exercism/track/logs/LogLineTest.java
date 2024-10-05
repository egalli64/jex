/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.logs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Logs, Logs, Logs! https://exercism.org/tracks/java/exercises/logs-logs-logs
 * <p>
 * Process log lines
 */
class LogLineTest {
    @Test
    void unknown() {
        var logLine = new LogLine("[ABC]: We're no strangers to love");
        assertThat(logLine.getOutputForShortLog()).isEqualTo("0:We're no strangers to love");
    }

    @Test
    void trace() {
        var logLine = new LogLine("[TRC]: You know the rules and so do I");
        assertThat(logLine.getOutputForShortLog()).isEqualTo("1:You know the rules and so do I");
    }

    @Test
    void fatal() {
        var logLine = new LogLine("[FTL]: Never gonna give you up");
        assertThat(logLine.getOutputForShortLog()).isEqualTo("42:Never gonna give you up");
    }
}
