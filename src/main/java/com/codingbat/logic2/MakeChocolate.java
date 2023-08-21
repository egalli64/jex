/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * makeChocolate - https://codingbat.com/prob/p191363
 * <p>
 * Given a "small" number of small chunks (sized 1) and a "big" number of big
 * chunks (sized 5), return the minimal number of small ones to get the "goal",
 * or -1.
 */
public class MakeChocolate {
    /**
     * Subtract from goal the part that could come from big chunks, that is, the
     * minimum between big multiplied by 5 and the highest multiple of 5 that is
     * less than goal. What is left is the goal that should be achieved using the
     * small chunks. Check if there are enough of them.
     * 
     * @param small number of chunks sized one
     * @param big   number of chunks sized five
     * @param goal  the target
     * @return how many small chunk are used (big first), or -1
     */
    public static int solution(int small, int big, int goal) {
        goal -= Math.min(big * 5, goal - goal % 5);
        return small >= goal ? goal : -1;
    }
}
