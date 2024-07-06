/*
 * 2582. Pass the Pillow - https://leetcode.com/problems/pass-the-pillow/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * There are n people in line labeled from 1 to n. The first (1) is holding a
 * pillow. Every second, the pillow is passed to the next person, till the end
 * and back.
 * 
 * Return the index of the final person holding the pillow.
 * 
 * Constraints: n in 2..1000, time in 1..1000
 */

public class PassThePillow {
    /**
     * Keep tracks of the moving direction
     */
    private enum Direction {
        LEFT, RIGHT
    }

    /**
     * As required, looping in both direction until time is off
     * 
     * @param n    number of persons
     * @param time number of passes
     * @return position at the end of the process
     */
    public int passThePillow(int n, int time) {
        int index = 1;
        Direction d = Direction.RIGHT;

        for (int i = 0; i < time; i++) {
            index += switch (d) {
            case RIGHT: {
                if (index < n) {
                    yield 1;
                } else {
                    d = Direction.LEFT;
                    yield -1;
                }
            }
            case LEFT: {
                if (index > 1) {
                    yield -1;
                } else {
                    d = Direction.RIGHT;
                    yield 1;
                }
            }
            };
        }

        return index;
    }

    /**
     * Consider the sequence generated from n (for example, 4), for t in [0 ...],
     * and see it in blocks, going left, going right:
     * 
     * <pre>
     * 1, 2, 3 * 4, 3, 2 * 1, 2, 3 * ...
     * </pre>
     * 
     * <p>
     * Each block is sized n - 1
     * <p>
     * The final block is the one given by t divided by block size
     * <p>
     * The blocks having even index are the natural ones (plus one)
     * <p>
     * The odd blocks require reverting the index
     * 
     * @param n    number of persons
     * @param time number of passes
     * @return position at the end of the process
     */
    public int oOne(int n, int time) {
        final int sub = time / (n - 1);
        final int pos = time % (n - 1);

        return sub % 2 == 0 ? pos + 1 : n - pos;
    }
}
