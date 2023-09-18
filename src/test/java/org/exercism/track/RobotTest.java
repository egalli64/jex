/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Robot Name - https://exercism.org/tracks/java/exercises/robot-name
 */
class RobotTest {
    private final Robot robot = new Robot();

    @Test
    public void robotNamesAreUnique() {
        Set<String> robotNames = new HashSet<>();
        int sampleSize = 5000;
        for (int i = 0; i < sampleSize; i++) {
            robotNames.add(new Robot().getName());
        }
        assertThat(robotNames).hasSize(sampleSize);
    }

    @Test
    public void sameRobotsHaveSameNames() {
        assertThat(robot.getName()).isEqualTo(robot.getName());
    }

    @Test
    public void differentRobotsHaveDifferentNames() {
        assertThat(robot.getName()).isNotEqualTo(new Robot().getName());
    }

    @Test
    public void hasName() {
        assertIsValidName(robot.getName());
    }

    @Test
    public void resetName() {
        final String name = robot.getName();
        robot.reset();
        final String name2 = robot.getName();
        assertThat(name).isNotEqualTo(name2);
        assertIsValidName(name2);
    }

    private void assertIsValidName(String name) {
        assertThat(name).matches(Pattern.compile("[A-Z]{2}\\d{3}"));
    }
}
