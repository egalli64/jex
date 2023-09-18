/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.binser;

/**
 * Binary Search: https://exercism.org/tracks/java/exercises/binary-search
 */
@SuppressWarnings("serial")
public class ValueNotFoundException extends Exception {
    ValueNotFoundException(String message) {
        super(message);
    }
}