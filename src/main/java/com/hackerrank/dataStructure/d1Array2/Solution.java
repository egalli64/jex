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
package com.hackerrank.dataStructure.d1Array2;

import java.util.Scanner;

public class Solution {
    private static int[] game;

    public static void setGame(int[] game) {
        assert game.length > 1 && game.length <= 100;

        Solution.game = game;
    }

    public static boolean canWin(int leap) {
        assert game.length >= leap;

        boolean[] memo = new boolean[game.length];
        if (game[game.length - 1] == 0)
            memo[memo.length - 1] = true;

        for (int i = memo.length - 2; i >= 0; i--) {
            if (game[i] == 0 && (i + leap >= game.length || memo[i + 1] || memo[i + leap])) {
                memo[i] = true;
                for (int j = i + 1; j < memo.length && game[j] == 0; j++)
                    memo[j] = true;
            }
        }

        return memo[0];
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int q = scanner.nextInt();
            while (q-- > 0) {
                int n = scanner.nextInt();
                int leap = scanner.nextInt();

                game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scanner.nextInt();
                }

                System.out.println((canWin(leap)) ? "YES" : "NO");
            }
        }
    }
}
