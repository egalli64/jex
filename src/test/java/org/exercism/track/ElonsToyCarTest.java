/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Elon's Toy Car: exercism.org/tracks/java/exercises/elons-toy-car
 * <p>
 * Cars start with full (100%) batteries. Each time you drive the car using the remote control,
 * it covers 20 meters and drains one percent of the battery.
 */
class ElonsToyCarTest {
    private final ElonsToyCar car = ElonsToyCar.buy();

    @Test
    void buy() {
        assertThat(car).isNotNull();
    }

    @Test
    void distanceDisplay() {
        String actual = car.distanceDisplay();
        String expected = "Driven 0 meters";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void batteryDisplay() {
        car.drive();
        assertThat(car.batteryDisplay()).isEqualTo("Battery at 99%");
    }

    @Test
    void drive() {
        car.drive();
        assertThat(car.distanceDisplay()).isEqualTo("Driven 20 meters");
    }

    @Test
    public void driveTillEmpty() {
        for (int i = 0; i < 99; i++) {
            car.drive();
        }
        assertThat(car.distanceDisplay()).isEqualTo("Driven 1980 meters");
        assertThat(car.batteryDisplay()).isEqualTo("Battery at 1%");

        for (int i = 0; i < 2; i++) {
            car.drive();
            assertThat(car.distanceDisplay()).isEqualTo("Driven 2000 meters");
            assertThat(car.batteryDisplay()).isEqualTo("Battery empty");
        }
    }
}