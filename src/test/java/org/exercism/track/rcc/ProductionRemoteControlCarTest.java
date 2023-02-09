/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
class ProductionRemoteControlCarTest {
    ProductionRemoteControlCar p1;
    ProductionRemoteControlCar p2;

    @BeforeEach
    void init() {
        p1 = new ProductionRemoteControlCar();
        p2 = new ProductionRemoteControlCar();

        p1.setNumberOfVictories(3);
        p2.setNumberOfVictories(2);
    }

    @Test
    void compareToPlain() {
        List<ProductionRemoteControlCar> cars = TestTrack.getRankedCars(p1, p2);
        assertThat(cars.get(1)).isEqualTo(p1);
    }

    @Test
    void compareToReversed() {
        List<ProductionRemoteControlCar> cars = TestTrack.getRankedCars(p2, p1);
        assertThat(cars.get(1)).isEqualTo(p1);
    }

    @Test
    void getNumberOfVictories() {
        assertThat(p1.getNumberOfVictories()).isGreaterThan(p2.getNumberOfVictories());
    }
}