/*
    Exercism Java track

    Source: https://exercism.org/tracks/java/exercises/say
    My solutions: https://github.com/egalli64/jex

    Say: Given a number from 0 to 999,999,999,999, spell out that number in English.
 */
package org.exercism.track;

import java.util.Map;

import static java.util.Map.entry;

public class Say {
    private static final long ONE_TRILLION = 1_000_000_000_000L;
    private static final int ONE_BILLION = 1_000_000_000;
    private static final String[] TINIES = { //
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", //
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", //
            "sixteen", "seventeen", "eighteen", "nineteen" //
    };

    private static final Map<Integer, String> TAGS = Map.ofEntries( //
            entry(1_000_000_000, " billion"), //
            entry(1_000_000, " million"), //
            entry(1_000, " thousand"), //
            entry(1, "") //
    );

    private static final String[] TENS = { //
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" //
    };

    /**
     * Convert a long in a string "saying" the number
     *
     * @param number in [0..ONE_TRILLION)
     * @return the number said in English
     */
    public String say(long number) {
        if (number < 0 || number >= ONE_TRILLION) {
            throw new IllegalArgumentException();
        }

        if (number < TINIES.length) {
            return TINIES[(int) number];
        }

        StringBuilder result = new StringBuilder();
        int threshold = ONE_BILLION;
        while (number > 0) {
            if (number >= threshold) {
                if (!result.isEmpty()) {
                    result.append(' ');
                }

                result.append(lessThanThousand((int) (number / threshold)));
                result.append(TAGS.get(threshold));
                number %= threshold;
            }
            threshold /= 1_000;
        }
        return result.toString();
    }

    /**
     * Convert a number in [0..999] to English representation
     *
     * @param number an integer in [0..999]
     * @return the number in plain English
     */
    private String lessThanThousand(int number) {
        int left = number / 100;
        int right = number % 100;
        boolean blank = left != 0 && right != 0;
        return String.format("%s%s%s", hundred(left), blank ? " " : "", lessThanHundred(right));
    }

    /**
     * Convert the number of hundreds to its English word
     *
     * @param number must be in [0..9]
     * @return something like five hundred, but empty string for zero
     */
    private String hundred(int number) {
        return number == 0 ? "" : String.format("%s hundred", TINIES[number]);
    }

    /**
     * Convert a small number to its English word
     *
     * @param number must be in [0..99]
     * @return the number in plain English, but empty string for zero
     */
    private String lessThanHundred(int number) {
        if (number == 0) {
            return "";
        }
        if (number < TINIES.length) {
            return TINIES[number];
        }

        StringBuilder result = new StringBuilder(TENS[number / 10]);
        int left = number % 10;
        if (left != 0) {
            result.append("-");
            result.append(TINIES[left]);
        }
        return result.toString();
    }
}
