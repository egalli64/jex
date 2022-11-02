/*
 * Prepare > Algorithms > Game Theory > Tower Breakers
 * https://www.hackerrank.com/challenges/tower-breakers-1/
 *
 * Given the number of towers and their initial height
 * Assuming two players, 1 (moves first) and 2, returns the winner
 *
 * Each turn the player chooses a tower, height x, and reduces it to y
 *  1 <= y < x, and x % y == 0
 *  if there is no way to do that, the other player wins
 *
 * if the initial height is 1, the first player looses immediately
 * if the numbers of towers is even, player 2 could copy the first player move, until winning
 * otherwise, player 1 kills a tower, reducing to the problem above, but now is 2 that can't win
 */
package com.hackerrank.algorithms.game;

public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        return n % 2 == 0 || m == 1 ? 2 : 1;
    }
}
