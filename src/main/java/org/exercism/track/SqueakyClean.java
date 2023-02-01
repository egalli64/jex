/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Squeaky Clean: exercism.org/tracks/java/exercises/squeaky-clean
 */
public class SqueakyClean {
    /**
     * Clean up a string
     * <li>spaces to underscore
     * <li>control chars to "CTRL"
     * <li>kebab-case to camelCase
     * <li>strip non-letters
     * <li>strip greek letters - [α ... ω]
     *
     * @param identifier a string, may be quite strange
     * @return a "clean" string
     */
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();

        boolean toUpper = false;
        for (int cp : identifier.codePoints().toArray()) {
            // first test control chars, to catch also whitespace-looking (as \r)
            if (Character.isISOControl(cp)) {
                result.append("CTRL");
            } else if (Character.isWhitespace(cp)) {
                result.append('_');
            } else if (cp == '-') {
                // kebab-case
                toUpper = true;
            } else if (Character.isLetter(cp) && (cp < 'α' || cp > 'ω')) {
                // previous char was '-'
                if (toUpper) {
                    cp = Character.toUpperCase(cp);
                    toUpper = false;
                }
                result.append((char) cp);
            }
        }

        return result.toString();
    }
}
