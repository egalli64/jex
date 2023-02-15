/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Rotational Cipher: exercism.org/tracks/java/exercises/rotational-cipher
 * <p>
 * The Caesar cipher is a simple shift cipher that relies on transposing all the letters in the alphabet
 * using an integer key between 0 and 26.
 * Using a key of 0 or 26 will always yield the same output due to modular arithmetic.
 * The letter is shifted for as many values as the value of the key.
 * <p>
 * The general notation for rotational ciphers is ROT + <key>.
 * <p>
 * ROT13:
 * Plain:  abcdefghijklmnopqrstuvwxyz
 * Cipher: nopqrstuvwxyzabcdefghijklm
 * <p>
 * Should work for upper and lower case, non-letter should be preserved
 */
class RotationalCipher {
    private static final int ALPHA_SIZE = 26;
    private final int shiftKey;

    /**
     * Constructor
     *
     * @param shiftKey in [0..26]
     * @throws IllegalArgumentException when shift is out of bound
     */
    RotationalCipher(int shiftKey) {
        if (shiftKey < 0 || shiftKey > ALPHA_SIZE) {
            throw new IllegalArgumentException("Ouf of bound shift key: " + shiftKey);
        }
        this.shiftKey = shiftKey;
    }

    /**
     * Encrypt a string using the shift defined by the constructor
     *
     * @param data to be encrypted
     * @return the encrypted string
     */
    String rotate(String data) {
        StringBuilder result = new StringBuilder(data);
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            // only letters are encrypted
            if (Character.isLetter(ch)) {
                char coded = (char) (ch + shiftKey);
                // out of bound letters are shifted back to the right interval
                if (Character.isUpperCase(ch) && coded > 'Z' || Character.isLowerCase(ch) && coded > 'z') {
                    coded -= ALPHA_SIZE;
                }
                result.setCharAt(i, coded);
            }
        }
        return result.toString();
    }
}
