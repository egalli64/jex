/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Football Match Reports: exercism.org/tracks/java/exercises/football-match-reports
 */
public class FootballMatchReports {
    public static String onField(int shirtNum) {
        return switch (shirtNum) {
            case 1 -> "goalie";
            case 2 -> "left back";
            case 3, 4 -> "center back";
            case 5 -> "right back";
            case 6, 7, 8 -> "midfielder";
            case 9 -> "left wing";
            case 10 -> "striker";
            case 11 -> "right wing";
            default -> throw new IllegalArgumentException();
        };
    }
}
