/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Need for Speed: exercism.org/tracks/java/exercises/need-for-speed
 * <p>
 * Each car has its own speed and battery drain characteristics.
 * Cars start with full (100%) batteries.
 */
class NeedForSpeed {
    private static final int FULL_CHARGE = 100;

    private final int speed;
    private final int batteryDrain;

    private int charge;
    private int distanceDriven;

    /**
     * Constructor
     *
     * @param speed        the car speed
     * @param batteryDrain drain for each drive
     */
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.charge = FULL_CHARGE;
        this.distanceDriven = 0;
    }

    /**
     * Factory method
     *
     * @return fast and furious model
     */
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    /**
     * Check status
     *
     * @return true if the car can't move anymore
     */
    public boolean batteryDrained() {
        return charge < batteryDrain;
    }

    /**
     * Getter
     *
     * @return the currently driven distance
     */
    public int distanceDriven() {
        return distanceDriven;
    }

    /**
     * Each time you drive the car using the remote control,
     * it covers the car's speed in meters and decreases the remaining battery percentage by its battery drain.
     */
    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            charge -= batteryDrain;
        }
    }
}

/**
 * A track for the cars
 */
class RaceTrack {
    private final int distance;

    /**
     * Constructor
     *
     * @param distance the track distance
     */
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    /**
     * Let a car try to run the track
     *
     * @param car the running car
     * @return true if it makes it
     */
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() <= distance) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
