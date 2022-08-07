/**
 * https://codingbat.com/java/Map-2
 */
package cb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map2 {
    /**
     * codingbat.com/prob/p152303
     *
     * @param strings a string array
     * @return a map having strings as keys, each associated to a zero value
     */
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>(strings.length);
        for (String key : strings) {
            result.put(key, 0);
        }

        return result;
    }

    /**
     * codingbat.com/prob/p117630
     *
     * @param strings a string array
     * @return a map having strings as keys, each associated its counter
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>(strings.length);
        for (String key : strings) {
            Integer previous = result.putIfAbsent(key, 1);
            if (previous != null) {
                result.put(key, previous + 1);
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p190862
     *
     * @param strings a string array
     * @return a map having strings as keys, associated to true if multiple
     */
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>(strings.length);
        for (String key : strings) {
            Boolean previous = result.putIfAbsent(key, false);
            if (previous != null && !previous) {
                result.put(key, true);
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p125327
     * 
     * @param strings
     * @return each input string -> its length
     */
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.putIfAbsent(s, s.length());
        }
        return result;
    }

    /**
     * codingbat.com/prob/p126332
     * 
     * @param strings array of non-empty strings
     * @return for each string: first char -> last char
     *         <li>if two strings have the same first char, the last string wins
     */
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) {
            result.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        return result;
    }

    /**
     * codingbat.com/prob/p168493
     * 
     * @param strings array of non-empty strings
     * @return for each string: first char -> string
     *         <li>if two strings have the same first char, concatenation
     */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            String value = result.putIfAbsent(key, s);
            if (value != null) {
                result.put(key, value + s);
            }
        }
        return result;
    }

    /**
     * codingbat.com/prob/p103593 <br>
     * Actually, no map required
     * 
     * @param strings an array
     * @return each string appearing even times concatenated
     *         <li>if a string appears 2n times, should be concatenated n times
     */
    public static String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();

        Set<String> checker = new HashSet<>();
        for (String s : strings) {
            if (checker.contains(s)) {
                checker.remove(s);
                result.append(s);
            } else {
                checker.add(s);
            }
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p134133
     * 
     * @param strings an array
     * @return swap strings with same first char
     *         <li>each string could swap just once
     */
    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String cur = strings[i];
            if (cur.isEmpty()) {
                continue;
            }

            Character key = cur.charAt(0);
            Integer pos = match.remove(key);
            if (pos != null) {
                String other = strings[pos];
                strings[pos] = cur;
                strings[i] = other;
            } else {
                match.put(key, i);
            }
        }
        return strings;
    }

    /**
     * codingbat.com/prob/p150113
     * 
     * @param strings an array
     * @return swap strings with same first char
     *         <li>each first-char-string could swap just once
     */
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> match = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String cur = strings[i];
            if (cur.isEmpty()) {
                continue;
            }

            Character key = cur.charAt(0);
            Integer pos = match.putIfAbsent(key, i);
            if (pos != null && pos != -1) {
                String other = strings[pos];
                strings[pos] = cur;
                strings[i] = other;

                match.put(key, -1);
            }
        }
        return strings;
    }
}
