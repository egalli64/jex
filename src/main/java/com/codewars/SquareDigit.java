package com.codewars;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

/**
 * Square every digit of a number and concatenate them
 * For example: 9119 -> 811181
 * <p>
 * www.codewars.com/kata/546e2562b03326a88e000020/java
 */
public class SquareDigit {
    public int squareDigitsStack(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only non negative arguments are accepted!");
        }
        Deque<Integer> stack = new ArrayDeque<>();

        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            int value = stack.pop();
            result.append(value * value);
        }
        return result.length() > 0 ? Integer.parseInt(result.toString()) : 0;
    }

    public int squareDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only non negative arguments are accepted!");
        }

        String result = Integer.toString(n).chars()
                .map(i -> i - '0').map(i -> i * i)
                .mapToObj(Integer::toString).collect(Collectors.joining());

        return Integer.parseInt(result);
    }
}
