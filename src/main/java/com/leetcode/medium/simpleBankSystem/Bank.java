/*
 * 2043. Simple Bank System - https://leetcode.com/problems/simple-bank-system/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.simpleBankSystem;

class Bank {
    /**
     * Beware! Account n is associated to balance n-1!
     */
    private final long[] balance;

    /**
     * Canonical constructor
     */
    public Bank(long[] balance) {
        this.balance = balance;
    }

    private boolean isInvalid(int index) {
        return index < 0 || index >= balance.length;
    }

    /**
     * Transfers money dollars from the account numbered account1 to the account numbered account2.
     * Return true if the transaction was successful, false otherwise.
     */
    public boolean transfer(int account1, int account2, long money) {
        int i = account1 - 1;
        int j = account2 - 1;
        if (isInvalid(i) || isInvalid(j) || balance[i] < money) {
            return false;
        }

        balance[i] -= money;
        balance[j] += money;
        return true;
    }

    /**
     * Deposit money dollars into the account numbered account.
     * Return true if the transaction was successful, false otherwise.
     */
    public boolean deposit(int account, long money) {
        int i = account - 1;
        if (isInvalid(i)) {
            return false;
        }

        balance[i] += money;
        return true;
    }

    /**
     * Withdraw money dollars from the account numbered account.
     * Return true if the transaction was successful, false otherwise.
     */
    public boolean withdraw(int account, long money) {
        int i = account - 1;
        if (isInvalid(i) || balance[i] < money) {
            return false;
        }

        balance[i] -= money;
        return true;
    }
}

class SmokeTest {
    static void main() {
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});

        if (!bank.withdraw(3, 10)) {
            System.err.println("Bad result from withdraw #1");
        }

        if (!bank.transfer(5, 1, 20)) {
            System.err.println("Bad result from transfer #1");
        }

        if (!bank.deposit(5, 20)) {
            System.err.println("Bad result from deposit");
        }

        if (bank.transfer(3, 4, 15)) {
            System.err.println("Bad result from transfer #2");
        }

        if (bank.withdraw(10, 50)) {
            System.err.println("Bad result from withdraw #2");
        }

        System.out.println("done");
    }
}
