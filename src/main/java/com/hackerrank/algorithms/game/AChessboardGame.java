/*
 * Prepare > Algorithms > Game Theory > A Chessboard Game
 * https://www.hackerrank.com/challenges/a-chessboard-game-1/
 *
 * In a chessboard 15x15, upper left is (1, 1), lower right (15, 15)
 * Given a valid position x, y
 * Two players, First and Second, move as a knight, but only the four ones on the left/up branches
 * The player who has no legal move loses
 * Return the winner
 *
 * Think to the top left 2x2 block. There is no valid move from there.
 * Think now to the other 12 cells in the top 4x4 block. From there you could move in the first sub-block.
 * Expand the analysis to the other cells, and you will find that the pattern repeats.
 *
 * The solution is just a matter of expressing this result in a compact way.
 */
package com.hackerrank.algorithms.game;

public class AChessboardGame {
    public static String chessboardGame(int x, int y) {
        return (x - 1) % 4 < 2 && (y - 1) % 4 < 2 ? "Second" : "First";
    }
}
