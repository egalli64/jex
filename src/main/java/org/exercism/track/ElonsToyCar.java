/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Elon's Toy Car: exercism.org/tracks/java/exercises/elons-toy-car
 * <p>
 * Cars start with full (100%) batteries. Each time you drive the car using the remote control,
 * it covers 20 meters and drains one percent of the battery.
 */
public class ElonsToyCar {
    /**
     * Driven distance, in meters [0,...)
     */
    private int distance;

    /**
     * Batteries charge, in percentage [0, 100]
     */
    private int charge;

    /**
     * New car, never moved, full batteries
     */
    private ElonsToyCar() {
        this.distance = 0;
        this.charge = 100;
    }

    /**
     * Factory method
     *
     * @return a brand-new remote controlled car instance
     */
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    /**
     * The distance as displayed: "Driven <METERS> meters"
     *
     * @return user defined message
     */
    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    /**
     * The batteries charge as displayed: "Battery at <PERCENTAGE>%" or "Battery empty"
     *
     * @return user defined message
     */
    public String batteryDisplay() {
        return "Battery " + (charge > 0 ? String.format("at %d%%", charge) : "empty");
    }

    /**
     * Each time you drive the car using the remote control,
     * it covers 20 meters and drains one percent of the battery.
     */
    public void drive() {
        if (charge > 0) {
            distance += 20;
            charge -= 1;
        }
    }
}