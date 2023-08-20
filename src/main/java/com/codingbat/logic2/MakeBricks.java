/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * makeBricks - https://codingbat.com/prob/p183562
 * <p>
 * Check if it is possible getting the "goal" adding up from "small" 1 tokens
 * and "big" 5 tokens
 */
public class MakeBricks {
    /**
     * Using "big" tokens it is not possible to get exactly the "goal" if modulo 5
     * is bigger than "small". If the total of "big" (sized 5) and "small" (sized 1)
     * is less than "goal" than it can't be reached.
     *
     * @param small number of bricks sized 1
     * @param big   number of bricks sized 5
     * @param goal  wall size
     * @return true if accepted
     */
    public static boolean stepByStep(int small, int big, int goal) {
        if (goal % 5 > small) {
            return false;
        }
        if (goal > big * 5 + small) {
            return false;
        }

        return true;
    }

    /**
     * One-liner, see {@linkplain MakeBricks#stepByStep(int, int, int)} for details
     *
     * @param small number of bricks sized 1
     * @param big   number of bricks sized 5
     * @param goal  wall size
     * @return true if accepted
     */
    public static boolean solution(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }
}
