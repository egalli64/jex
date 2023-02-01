/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Cars, Assemble: exercism.org/tracks/java/exercises/cars-assemble
 * <p>
 * The assembly line's speed can range from 0 (off) to 10 (maximum).
 * At its lowest speed (1), 221 cars are produced each hour.
 * The production increases linearly with the speed.
 * So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour.
 * However, higher speeds increase the likelihood that faulty cars are produced.
 * <p>
 * Speed vs Success rate:
 * <li>1 to 4: 100% success rate.
 * <li>5 to 8: 90% success rate.
 * <li>9: 80% success rate.
 * <li>10: 77% success rate.
 */
public class CarsAssemble {
    private static final int CARS_PER_HOUR_LEVEL = 221;

    /**
     * Calculate production
     *
     * @param speed in [1..10], otherwise 0 (off) is assumed
     * @return production rate
     */
    public double productionRatePerHour(int speed) {
        return CARS_PER_HOUR_LEVEL * speed * switch (speed) {
            case 1, 2, 3, 4 -> 1.0;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0;
        };
    }

    /**
     * Approximate the production per minute
     *
     * @param speed in [1..10], otherwise 0 (off) is assumed
     * @return production per minute
     */
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}