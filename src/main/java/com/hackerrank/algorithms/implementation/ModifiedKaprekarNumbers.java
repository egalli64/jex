/*
    Prepare > Algorithms > Implementation > Modified Kaprekar Numbers
    https://www.hackerrank.com/challenges/kaprekar-numbers/problem

    Print the Modified Kaprekar Numbers in a given range
 */
package com.hackerrank.algorithms.implementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class ModifiedKaprekarNumbers {
    public static boolean isKaprekar(int candidate) {
        Deque<Integer> ciphers = new ArrayDeque<>();

        long squared = (long) candidate * candidate;
        while (squared > 0) {
            ciphers.addFirst((int) (squared % 10));
            squared /= 10;
        }

        int left = 0;
        for (int i = 0, end = ciphers.size() / 2; i < end; i++) {
            left *= 10;
            left += ciphers.removeFirst();
        }

        int right = 0;
        while (!ciphers.isEmpty()) {
            right *= 10;
            right += ciphers.removeFirst();
        }

        return left + right == candidate;
    }

    public static void kaprekarNumbers(int p, int q) {
        int counter = 0;

        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                counter += 1;
            }
        }

        if (counter == 0) {
            System.out.println("INVALID RANGE");
        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 100);
    }
}
