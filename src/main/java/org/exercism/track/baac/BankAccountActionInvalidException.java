/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.baac;

/**
 * Bank Account: https://exercism.org/tracks/java/exercises/bank-account
 */
@SuppressWarnings("serial")
public class BankAccountActionInvalidException extends Exception {
    BankAccountActionInvalidException(String message) {
        super(message);
    }
}