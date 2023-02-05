/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Need for Speed: exercism.org/tracks/java/exercises/need-for-speed
 */
class NeedForSpeedTest {
    private final NeedForSpeed nfs = new NeedForSpeed(10, 2);
    private final RaceTrack rt = new RaceTrack(800);

    @Test
    void canCreate() {
        assertThat(nfs).isNotNull();
    }

    @Test
    void nitro() {
        NeedForSpeed nitro = NeedForSpeed.nitro();
        nitro.drive();
        assertThat(nitro.distanceDriven()).isEqualTo(50);
    }

    @Test
    void batteryDrainedForNewCar() {
        assertThat(nfs.batteryDrained()).isFalse();
    }

    @Test
    void batteryDrainedAfterDriving() {
        for (var i = 0; i < 49; i++) {
            nfs.drive();
        }
        assertThat(nfs.batteryDrained()).isFalse();
        nfs.drive();
        assertThat(nfs.batteryDrained()).isTrue();
    }

    @Test
    void distanceDrivenForNewCar() {
        assertThat(nfs.distanceDriven()).isZero();
    }

    @Test
    void drive() {
        assertThat(nfs.distanceDriven()).isZero();
        nfs.drive();
        assertThat(nfs.distanceDriven()).isEqualTo(10);
    }

    @Test
    void driveWithBatteryDrained() {
        for (var i = 0; i < 50; i++) {
            nfs.drive();
        }
        assertThat(nfs.distanceDriven()).isEqualTo(500);
        nfs.drive();
        assertThat(nfs.distanceDriven()).isEqualTo(500);
    }

    @Test
    void canCreateRaceTrack() {
        assertThat(rt).isNotNull();
    }

    @Test
    void tryFinishTrack() {
        assertThat(rt.tryFinishTrack(nfs)).isFalse();
    }

    @Test
    void tryFinishTrackNitro() {
        assertThat(rt.tryFinishTrack(NeedForSpeed.nitro())).isTrue();
    }

    @Test
    public void tryFinishTrackBarely() {
        var car = new NeedForSpeed(2, 10);
        var race = new RaceTrack(20);
        assertThat(race.tryFinishTrack(car)).isTrue();
    }
}