/*
    Prepare > Algorithms > Implementation > Sherlock and Squares
    https://www.hackerrank.com/challenges/sherlock-and-squares/problem

    Determine the number of square integers within the passed inclusive range
 */
package com.hackerrank.algorithms.implementation;

public class SherlockAndSquares {
    public static int squares(int a, int b) {
        return 1 + (int) Math.sqrt(b) - (int) Math.ceil(Math.sqrt(a));
    }
}
