/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Bird Watcher: exercism.org/tracks/java/exercises/bird-watcher
 */
class BirdWatcher {
    /**
     * Five birds make the day busy
     */
    private static final int BUSY_DAY = 5;

    /**
     * History for the last seven days of watching
     */
    private final int[] birdsPerDay;

    /**
     * Constructor, clone the input array and store it as data member (with no check)
     *
     * @param birdsPerDay last week report
     */
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /**
     * Getter
     *
     * @return a defensive copy of the data member
     */
    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    /**
     * Getter for the last day in cache, notice that cache could be sized 0!
     *
     * @return today count
     */
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    /**
     * Increase current count
     */
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    /**
     * check for no-watch day
     *
     * @return true if there is at least a zero-day
     */
    public boolean hasDayWithoutBirds() {
        for (int cur : birdsPerDay) {
            if (cur == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Limited-adder
     *
     * @param numberOfDays limiter
     * @return sum of counts for the specified days
     */
    public int getCountForFirstDays(int numberOfDays) {
        int cutoff = Math.min(numberOfDays, birdsPerDay.length);
        int result = 0;

        for (int i = 0; i < cutoff; i++) {
            result += birdsPerDay[i];
        }
        return result;
    }

    /**
     * Getter for busy days
     *
     * @return busy days count
     */
    public int getBusyDays() {
        int result = 0;
        for (int cur : birdsPerDay) {
            if (cur >= BUSY_DAY) {
                result += 1;
            }
        }
        return result;
    }
}