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
class LogLevelTest {
    @Test
    void trace() {
        assertThat(LogLevel.from("TRC")).isEqualTo(LogLevel.TRACE);
    }

    @Test
    void debug() {
        assertThat(LogLevel.from("DBG")).isEqualTo(LogLevel.DEBUG);
    }

    @Test
    void info() {
        assertThat(LogLevel.from("INF")).isEqualTo(LogLevel.INFO);
    }

    @Test
    void warning() {
        assertThat(LogLevel.from("WRN")).isEqualTo(LogLevel.WARNING);
    }

    @Test
    void error() {
        assertThat(LogLevel.from("ERR")).isEqualTo(LogLevel.ERROR);
    }

    @Test
    void fatal() {
        assertThat(LogLevel.from("FTL")).isEqualTo(LogLevel.FATAL);
    }

    @Test
    void unknown() {
        assertThat(LogLevel.from("XYZ")).isEqualTo(LogLevel.UNKNOWN);
    }
}
