/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Wizards and Warriors: exercism.org/tracks/java/exercises/wizards-and-warriors
 */
class FighterTest {
    private final Warrior warrior = new Warrior();
    private final Wizard wizard = new Wizard();

    @Test
    void toStringTypes() {
        Assertions.assertThat(warrior.toString()).endsWith("Warrior");
        Assertions.assertThat(wizard.toString()).endsWith("Wizard");
    }

    @Test
    void isVulnerable() {
        Assertions.assertThat(warrior.isVulnerable()).isFalse();
        Assertions.assertThat(wizard.isVulnerable()).isTrue();

        wizard.prepareSpell();
        Assertions.assertThat(wizard.isVulnerable()).isFalse();
    }

    @Test
    void damagePoints() {
        Assertions.assertThat(wizard.damagePoints(warrior)).isEqualTo(Wizard.LOW_DAMAGE);
        Assertions.assertThat(warrior.damagePoints(wizard)).isEqualTo(Warrior.HIGH_DAMAGE);
        wizard.prepareSpell();
        Assertions.assertThat(wizard.damagePoints(warrior)).isEqualTo(Wizard.HIGH_DAMAGE);
        Assertions.assertThat(warrior.damagePoints(wizard)).isEqualTo(Warrior.LOW_DAMAGE);
    }
}