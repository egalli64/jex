/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
class RemoteControlCarTest {
    private final RemoteControlCar prod = new ProductionRemoteControlCar();
    private final RemoteControlCar expr = new ExperimentalRemoteControlCar();

    @Test
    void differentCars() {
        assertThat(prod).isNotSameAs(expr);
    }

    @Test
    void getDistanceTravelledNewCars() {
        assertThat(prod.getDistanceTravelled()).isEqualTo(0);
        assertThat(expr.getDistanceTravelled()).isEqualTo(0);
    }

    @Test
    void getDistanceTravelledAfterOneRace() {
        TestTrack.race(prod);
        TestTrack.race(expr);
        assertThat(prod.getDistanceTravelled()).isEqualTo(ProductionRemoteControlCar.DISTANCE_TRAVELLED);
        assertThat(expr.getDistanceTravelled()).isEqualTo(ExperimentalRemoteControlCar.DISTANCE_TRAVELLED);
    }

}