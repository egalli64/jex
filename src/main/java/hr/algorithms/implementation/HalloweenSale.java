/*
    Prepare > Algorithms > Implementation > Halloween Sale
    https://www.hackerrank.com/challenges/halloween-sale/problem

    Given base price, increasing discount, minimum price, budget, how many games could buy
 */
package hr.algorithms.implementation;

public class HalloweenSale {
    public static int howManyGames(int basePrice, int discount, int minimum, int budget) {
        int result = 0;
        int currentItemPrice = basePrice;
        while(budget >= currentItemPrice) {
            result += 1;
            budget -= currentItemPrice;
            currentItemPrice = Math.max(minimum, currentItemPrice - discount);
        }

        return result;
    }
}
