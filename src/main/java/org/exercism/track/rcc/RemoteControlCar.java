/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
public interface RemoteControlCar {
    /**
     * Getter
     *
     * @return current distance
     */
    int getDistanceTravelled();

    /**
     * Drive the car, increase distance
     */
    void drive();
}
