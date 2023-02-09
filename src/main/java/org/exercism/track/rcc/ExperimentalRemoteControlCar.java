/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
public class ExperimentalRemoteControlCar implements RemoteControlCar {
    public static final int DISTANCE_TRAVELLED = 20;
    private int distance;

    /**
     * Constructor
     */
    public ExperimentalRemoteControlCar() {
        this.distance = 0;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    @Override
    public void drive() {
        distance += DISTANCE_TRAVELLED;
    }
}
