/*
 * HackerRank Java Data Structures: Java 1D Array (Part 2)
 *
 * @author: Manny egalli64@gmail.com
 * @see: http://thisthread.blogspot.com/2018/06/hackerrank-java-1d-array-part-2.html
 *       https://www.hackerrank.com/challenges/java-1d-array/problem
 *
 * Given an array of (0, 1), starting on position 0, we should get out to the right side.
 * We can move
 *  - backward by 1
 *  - forward by 1 or 'leap'
 * But only if the ending has value 0 (or out of bound to right)
 *
 * game[0] is always 0
 * array size and leap is up to 100
 *
 * Can we win?
 */

package hr.dataStructure.d1Array2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testGiven1() {
        Solution.setGame(new int[] {0, 0, 0, 0, 0});
        assertTrue(Solution.canWin(3));
    }

    @Test
    void testGiven2() {
        Solution.setGame(new int[] {0, 0, 0, 1, 1, 1});
        assertTrue(Solution.canWin(5));
    }

    @Test
    void testGiven3() {
        Solution.setGame(new int[] {0, 0, 1, 1, 1, 0});
        assertFalse(Solution.canWin(3));
    }

    @Test
    void testGiven4() {
        Solution.setGame(new int[] {0, 1, 0});
        assertFalse(Solution.canWin(1));
    }

    @Test
    void testAlternate() {
        Solution.setGame(new int[] {0, 1, 0, 1});
        assertTrue(Solution.canWin(2));
    }

    @Test
    void testBarrierOne() {
        Solution.setGame(new int[] {0, 1, 1, 0, 0, 1, 0, 0, 1});
        assertTrue(Solution.canWin(4));
    }

    @Test
    void testBarrierTwo() {
        Solution.setGame(new int[] {0, 1, 0, 0, 0, 1, 0, 1, 1});
        assertTrue(Solution.canWin(4));
    }

    @Test
    void testBadLeap() {
        Solution.setGame(new int[] {0, 0, 0, 0, 0});
        assertThrows(AssertionError.class, () -> Solution.canWin(42));
    }
}