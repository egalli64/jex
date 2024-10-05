/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.logs;

/**
 * Logs, Logs, Logs! https://exercism.org/tracks/java/exercises/logs-logs-logs
 * <p>
 * Process log lines
 */
public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.from(logLine.substring(1, 4));
    }

    public String getOutputForShortLog() {
        int tail = logLine.indexOf(':') + 2;
        return getLogLevel().getCode() + ":" + logLine.substring(tail);
    }
}
