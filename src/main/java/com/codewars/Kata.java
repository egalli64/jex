package com.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Your goal is to return multiplication table for number that is always an integer from 1 to 10
 * <p>
 * www.codewars.com/kata/5a2fd38b55519ed98f0000ce/java
 */
public class Kata {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> String.format("%d * %d = %d", i, num, i * num))
                .collect(Collectors.joining("\n"));
    }

    public static String multiTableClassic(int num) {
        final int SIZE = 10;
        String[] lines = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            lines[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
        }

        return String.join("\n", lines);
    }
}