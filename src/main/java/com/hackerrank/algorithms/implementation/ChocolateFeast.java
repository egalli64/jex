/*
    Prepare > Algorithms > Implementation > Chocolate Feast
    https://www.hackerrank.com/challenges/chocolate-feast/problem

    Given budget, price and extra how many items could buy
        any "extra" item you get an item more!
 */
package com.hackerrank.algorithms.implementation;

public class ChocolateFeast {
    public static int chocolateFeast(int budget, int price, int extra) {
        int result = budget / price;

        int wrapper = result;
        while(wrapper >= extra) {
            int barCount = wrapper / extra;
            wrapper = barCount + wrapper % extra;
            result += barCount;
        }

        return result;
    }
}
