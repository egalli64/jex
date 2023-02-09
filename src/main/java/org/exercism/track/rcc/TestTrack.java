/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.rcc;

import java.util.Arrays;
import java.util.List;

/**
 * Remote Control Competition: exercism.org/tracks/java/exercises/remote-control-competition
 */
public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> result = Arrays.asList(prc1, prc2);
        result.sort(null);
        return result;
    }
}
