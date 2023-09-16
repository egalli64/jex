/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.calc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

/**
 * Calculator Conundrum: exercism.org/tracks/java/exercises/calculator-conundrum
 */
class CalculatorConundrumTest {
    private final CalculatorConundrum calc = new CalculatorConundrum();

    @Test
    public void throwExceptionForAnEmptyStringOperation() {
        assertThatIllegalArgumentException() //
                .isThrownBy(() -> calc.calculate(34, 324, "")) //
                .withMessage("Operation cannot be empty");
    }

    @Test
    public void divisionWithSmallOperands() {
        assertThat(calc.calculate(72, 9, "/")).isEqualTo("72 / 9 = 8");
    }

    @Test
    public void throwExceptionForNullAsOperation() {
        assertThatIllegalArgumentException() //
                .isThrownBy(() -> calc.calculate(66, 65, null)) //
                .withMessage("Operation cannot be null");
    }

    @Test
    public void throwExceptionForDivisionByZero() {
        assertThatExceptionOfType(IllegalOperationException.class) //
                .isThrownBy(() -> calc.calculate(33, 0, "/")) //
                .withMessage("Division by zero is not allowed") //
                .withCauseInstanceOf(ArithmeticException.class);
    }

    @Test
    public void divisionWithLargeOperands() {
        assertThat(calc.calculate(1_338_800, 83_675, "/")).isEqualTo("1338800 / 83675 = 16");
    }

    @Test
    public void additionWithSmallOperands() {
        assertThat(calc.calculate(22, 25, "+")).isEqualTo("22 + 25 = 47");
    }

    @Test
    public void throwExceptionForUnknownOperation() {
        String op = "**";
        String expectedMessage = String.format("Operation '%s' does not exist", op);
        assertThatExceptionOfType(IllegalOperationException.class) //
                .isThrownBy(() -> calc.calculate(3, 78, op)) //
                .withMessage(expectedMessage);
    }

    @Test
    public void additionWithLargeOperands() {
        assertThat(calc.calculate(378_961, 399_635, "+")).isEqualTo("378961 + 399635 = 778596");
    }

    @Test
    public void multiplicationWithSmallOperands() {
        assertThat(calc.calculate(3, 21, "*")).isEqualTo("3 * 21 = 63");
    }

    @Test
    public void multiplicationWithLargeOperands() {
        assertThat(calc.calculate(72_441, 2_048, "*")).isEqualTo("72441 * 2048 = 148359168");
    }
}
