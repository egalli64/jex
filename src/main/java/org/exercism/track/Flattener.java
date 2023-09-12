/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.List;
import java.util.stream.Stream;

/**
 * Flatten Array - https://exercism.org/tracks/java/exercises/flatten-array
 * <p>
 * Given a multilevel nested list of Objects, possibly with null in it, return
 * it flat with no null at all.
 */
public class Flattener {
    /**
     * Stream the list, use {@linkplain Flattener#flatten(Object)} to flat-map it,
     * collect the result to a new list
     * 
     * @param data a list
     * @return a clean version of the input list
     */
    public List<Object> flatten(List<Object> data) {
        return data.stream().flatMap(this::flatten).toList();
    }

    /**
     * If the passed object is a list, stream and flat-map it using recursively this
     * method, otherwise, generate a single-element stream, or an empty one to get
     * rid of null.
     * <p>
     * Helper for {@linkplain Flattener#flatten(List)}
     * 
     * 
     * @param obj the object to be flattened
     * @return a flattened stream
     */
    private Stream<Object> flatten(Object obj) {
        return obj instanceof List //
                ? ((List<?>) obj).stream().flatMap(this::flatten) //
                : Stream.ofNullable(obj);
    }
}
