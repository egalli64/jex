/**
 * https://codingbat.com/java/Map-2
 */
package cb;

import java.util.HashMap;
import java.util.Map;

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
}
