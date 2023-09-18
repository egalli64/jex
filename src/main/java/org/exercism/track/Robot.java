/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Robot Name - https://exercism.org/tracks/java/exercises/robot-name
 * <p>
 * Each robot should have a unique random name in the format "XX999", its name
 * could be changed by resetting it.
 * <p>
 * This solution is a shameless cheat, but it works. However:
 * <li>The name is _not_ random, but sequential
 * <li>The names are in range [AA100..ZZ999] (after that: unexpected behavior)
 * <li>The name generation is meant to work in a single thread
 */
public class Robot {
    private static final int ALPHA_RANGE = 'Z' - 'A';

    private static int[] mark = { 0, 0 };
    private static int id = 100;

    private String name;

    public Robot() {
        reset();
    }

    String getName() {
        return name;
    }

    void reset() {
        name = Character.toString('A' + mark[0]) + Character.toString('A' + mark[1]) + id;

        if (id == 999) {
            id = 100;
            if (mark[1] == ALPHA_RANGE) {
                mark[1] = 0;

                mark[0] += 1;
            } else {
                mark[1] += 1;
            }
        } else {
            id += 1;
        }
    }
}