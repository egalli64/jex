/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.binser;

import java.util.List;

/**
 * Binary Search: https://exercism.org/tracks/java/exercises/binary-search
 */
class BinarySearch {
    private List<Integer> items;

    BinarySearch(List<Integer> items) {
        this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
        int begin = 0;
        int end = items.size();

        while (begin < end) {
            int index = begin + (end - begin) / 2;
            int value = items.get(index);
            if (value > item) {
                end = index;
            } else if (value < item) {
                begin = index + 1;
            } else {
                return index;
            }
        }

        throw new ValueNotFoundException("Value not in array");
    }
}