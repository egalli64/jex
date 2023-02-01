/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Bird Watcher: exercism.org/tracks/java/exercises/bird-watcher
 */
class BirdWatcherTest {
    /**
     * just for testing purpose, think of it as an immutable
     */
    private static final int[] week = {0, 2, 5, 3, 7, 8, 4};
    private final BirdWatcher instance = new BirdWatcher(week);

    @Test
    void getLastWeek() {
        int[] actual = instance.getLastWeek();
        assertThat(actual).isEqualTo(week);
    }

    @Test
    void getToday() {
        int actual = instance.getToday();
        assertThat(actual).isEqualTo(week[week.length - 1]);
    }

    @Test
    void getTodaySilly() {
        int actual = new BirdWatcher(new int[]{}).getToday();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void incrementTodaysCount() {
        instance.incrementTodaysCount();
        int expected = week[week.length - 1] + 1;
        int actual = instance.getToday();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void hasDayWithoutBirds() {
        assertThat(instance.hasDayWithoutBirds()).isTrue();
    }

    @Test
    void getCountForFirstDays() {
        int expected = 7;
        int actual = instance.getCountForFirstDays(3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getBusyDays() {
        assertThat(instance.getBusyDays()).isEqualTo(3);
    }
}