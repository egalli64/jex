/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Pig Latin: https://exercism.org/tracks/java/exercises/pig-latin
 */
class PigLatinTranslator {
    /**
     * Translate the passed word to Pig Latin
     * 
     * @param word a non-empty string
     * @return translation
     */
    public String translate(String word) {
        String[] words = word.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = translateWord(words[i]);
        }
        return String.join(" ", result);
    }

    private String translateWord(String word) {
        // Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
        // the word. Please note that "xr" and "yt" at the beginning of a word make
        // vowel sounds (e.g. "xray" -> "xrayay", "yttria" -> "yttriaay").
        if (startByVowelSound(word)) {
            return word + "ay";
        }

        // Rule 3: If a word starts with a consonant sound followed by "qu", move it to
        // the end of the word, and then add an "ay" sound to the end of the word (e.g.
        // "square" -> "aresquay").
        int shift = startingConsonantSoundSize(word);
        if (hasQu(word, shift)) {
            shift += 2;
            return word.substring(shift) + word.substring(0, shift) + "ay";
        }

        // Rule 4: If a word contains a "y" after a consonant cluster or as the second
        // letter in a two letter word it makes a vowel sound (e.g. "rhythm" ->
        // "ythmrhay", "my" -> "ymay").
        if (hasY(word, shift)) {
            return word.substring(shift) + word.substring(0, shift) + "ay";
        }

        // Rule 2: If a word begins with a consonant sound, move it to the end of the
        // word and then add an "ay" sound to the end of the word. Consonant sounds can
        // be made up of multiple consonants, such as the "ch" in "chair" or "st" in
        // "stand" (e.g. "chair" -> "airchay").
        return word.substring(shift) + word.substring(0, shift) + "ay";
    }

    private boolean hasQu(String word, int gap) {
        return word.charAt(gap) == 'q' && word.charAt(gap + 1) == 'u';
    }

    private boolean hasY(String word, int gap) {
        return word.charAt(gap) == 'y';
    }

    private boolean startByVowelSound(String word) {
        if (word.startsWith("ye")) {
            return false;
        } else if (word.startsWith("xr") || word.startsWith("yr")) {
            return true;
        } else {
            return word.matches("^[aeiouy].*");
        }
    }

    private int startingConsonantSoundSize(String word) {
        if (word.startsWith("sch") || word.startsWith("thr")) {
            return 3;
        } else if (word.startsWith("ch") || word.startsWith("st") //
                || word.startsWith("qu") || word.startsWith("th") || word.startsWith("rh")) {
            return 2;
        } else {
            return 1;
        }
    }
}