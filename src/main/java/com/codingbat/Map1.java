/**
 * https://codingbat.com/java/Map-1
 */
package com.codingbat;

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

    /**
     * codingbat.com/prob/p148813
     *
     * @param map a map
     * @return the map, if key "a" has a value, set it to "b" too; remove "c"
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null) {
            map.put("b", aValue);
        }
        map.remove("c");
        return map;
    }

    /**
     * codingbat.com/prob/p107259
     *
     * @param map a map
     * @return if keys a and b are both present, add "ab" -> value a + value b
     */
    public static Map<String, String> mapAB(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null) {
            map.put("ab", a + b);
        }

        return map;
    }

    /**
     * codingbat.com/prob/p196458
     *
     * @param map a map
     * @return <pre>
     * if key "ice cream" -> value, set key "yogurt" -> value;
     * if key "spinach" -> value, set it to "nuts";
     * </pre>
     */
    public static Map<String, String> topping2(Map<String, String> map) {
        String value = map.get("ice cream");
        if (value != null) {
            map.put("yogurt", value);
        }
        map.replace("spinach", "nuts");
        return map;
    }

    /**
     * codingbat.com/prob/p128461
     *
     * @param map a map
     * @return <pre>
     * if key "potato" -> value, then "fries" -> value
     * if key "salad" -> value, then "spinach" -> value
     * </pre>
     */
    public static Map<String, String> topping3(Map<String, String> map) {
        String potato = map.get("potato");
        if (potato != null) {
            map.put("fries", potato);
        }

        String salad = map.get("salad");
        if (salad != null) {
            map.put("spinach", salad);
        }

        return map;
    }

    /**
     * codingbat.com/prob/p115012
     *
     * @param map a map
     * @return if only one between keys "a" or "b" has a value, set the other to that value
     */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if (a != null && b == null) {
            map.put("b", a);
        }
        if (a == null && b != null) {
            map.put("a", b);
        }
        return map;
    }

    /**
     * codingbat.com/prob/p136950
     *
     * @param map a map
     * @return <pre>
     * if key "a" and key "b" have values with different lengths, set "c" -> the longest
     * if they have the same length -> set both to empty strings
     * </pre>
     */
    public static Map<String, String> mapAB4(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null) {
            if (a.length() == b.length()) {
                map.put("a", "");
                map.put("b", "");
            } else {
                map.put("c", a.length() > b.length() ? a : b);
            }
        }
        return map;
    }
}
