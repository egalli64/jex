/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    public static final int DISTANCE_TRAVELLED = 10;

    private int victories;
    private int distance;

    /**
     * Constructor
     */
    public ProductionRemoteControlCar() {
        this.victories = 0;
        this.distance = 0;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    /**
     * Getter
     *
     * @return victories
     */
    public int getNumberOfVictories() {
        return victories;
    }

    /**
     * Setter
     *
     * @param numberOfVictories victories
     */
    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(this.victories, other.victories);
    }

    @Override
    public void drive() {
        distance += DISTANCE_TRAVELLED;
    }
}
