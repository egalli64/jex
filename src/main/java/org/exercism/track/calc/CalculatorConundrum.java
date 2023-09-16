/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.calc;

/**
 * Calculator Conundrum: exercism.org/tracks/java/exercises/calculator-conundrum
 */
public class CalculatorConundrum {
    /**
     * Generate a string representing the resulting equation
     * 
     * @param operand1  first operand
     * @param operand2  second operand
     * @param operation only +, - and / are supported
     * @return the resulting equation
     * @throws IllegalArgumentException  for missing operations
     * @throws IllegalOperationException for unknown operation and division by zero
     */
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            int total = switch (operation) {
            case "+" -> operand1 + operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };

            return String.format("%d %s %d = %d", operand1, operation, operand2, total);
        } catch (ArithmeticException ex) {
            throw new IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
}
