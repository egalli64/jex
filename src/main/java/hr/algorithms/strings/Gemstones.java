/*
 * Prepare > Algorithms > Implementation > Gemstones
 * https://www.hackerrank.com/challenges/gem-stones/
 * <p>
 * Given a non-empty list of non-empty strings containing letters in [a-z]
 * Return the number of letters that appear at least once in each string
 */
package hr.algorithms.strings;

import java.util.HashSet;
import java.util.List;

public class Gemstones {
    public static int gemstones(List<String> arr) {
        boolean[][] buffer = new boolean[26][arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            for (char c : arr.get(j).toCharArray()) {
                buffer[c - 'a'][j] = true;
            }
        }

        int counter = 0;
        for (int i = 0; i < 26; i++) {
            boolean isGem = true;
            for (int j = 0; j < arr.size(); j++) {
                if (!buffer[i][j]) {
                    isGem = false;
                    break;
                }
            }
            if (isGem) {
                counter += 1;
            }
        }

        return counter;
    }

    public static int gemstones2(List<String> arr) {
        String base = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            base = intersectionNoDuplicates(base, arr.get(i));
        }
        return base.length();
    }

    private static String intersectionNoDuplicates(String s, String t) {
        HashSet<Character> sh = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            sh.add(s.charAt(i));
        }

        HashSet<Character> th = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            th.add(t.charAt(i));
        }

        sh.retainAll(th);
        StringBuilder result = new StringBuilder(sh.size());
        for(char c : sh) {
            result.append(c);
        }
        return result.toString();
    }
}
