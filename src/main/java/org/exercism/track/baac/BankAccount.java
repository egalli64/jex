/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.baac;

/**
 * Bank Account: https://exercism.org/tracks/java/exercises/bank-account
 * <p>
 * Basic implementation synchronizing on methods
 */
class BankAccount {
    private int balance;
    private boolean closed;

    public BankAccount() {
        this.balance = 0;
        this.closed = true;
    }

    void open() {
        balance = 0;
        closed = false;
    }

    void close() {
        closed = true;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }

        return balance;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        checkMove(amount);

        balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        checkMove(amount);
        checkWithdraw(amount);
        balance -= amount;
    }

    private void checkWithdraw(int amount) throws BankAccountActionInvalidException {
        if (balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        } else if (amount > balance) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
    }

    private void checkMove(int amount) throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        } else if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
    }
}