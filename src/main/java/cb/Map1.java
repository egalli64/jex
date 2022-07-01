/**
 * https://codingbat.com/java/Map-1
 */
package cb;

import java.util.Map;

public class Map1 {
    /**
     * codingbat.com/prob/p197888
     *
     * @param map a map
     * @return map, after moving the value associated to a, if exists, in b
     */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /**
     * codingbat.com/prob/p182712
     *
     * @param map a map
     * @return a map with bread set to butter and, if already present, ice cream set to cherry
     */
    public static Map<String, String> topping1(Map<String, String> map) {
        String toBeChanged = "ice cream";
        if (map.containsKey(toBeChanged)) {
            map.put(toBeChanged, "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

    /**
     * codingbat.com/prob/p115011
     *
     * @param map a map
     * @return the input map, if the keys "a" and "b" are both in the map and have equal values, remove them
     */
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
