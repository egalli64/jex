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
public enum LogLevel {
    UNKNOWN("", 0), //
    TRACE("TRC", 1), DEBUG("DBG", 2), INFO("INF", 4), WARNING("WRN", 5), ERROR("ERR", 6), FATAL("FTL", 42);

    private String id;
    private int code;

    LogLevel(String id, int code) {
        this.id = id;
        this.code = code;
    }

    public static LogLevel from(String id) {
        for (LogLevel level : LogLevel.values()) {
            if (level.id.equals(id)) {
                return level;
            }
        }
        return UNKNOWN;
    }

    public int getCode() {
        return code;
    }
}
