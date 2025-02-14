/*
 * 1352. Product of the Last K Numbers - https://leetcode.com/problems/product-of-the-last-k-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.productLastNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Manage a dynamic sequence, on request, get the product of the last k elements
 */
class ProductOfNumbers {
    private List<Integer> products;

    /**
     * Initialize the list with the multiplication identity (1) to keep the
     * algorithm simple
     */
    public ProductOfNumbers() {
        this.products = new ArrayList<>();
        this.products.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            products.clear();
            products.add(1);
        } else {
            products.add(products.getLast() * num);
        }
    }

    public int getProduct(int k) {
        final int last = products.size() - 1;
        return k > last ? 0 : products.getLast() / products.get(last - k);
    }

    /**
     * Smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        ProductOfNumbers pon = new ProductOfNumbers();
        pon.add(3);
        pon.add(0);
        pon.add(2);
        pon.add(5);
        pon.add(4);
        System.out.println("(20) " + pon.getProduct(2));
        System.out.println("(40) " + pon.getProduct(3));
        System.out.println("(0) " + pon.getProduct(4));
        pon.add(8);
        System.out.println("(32) " + pon.getProduct(2));
    }
}
