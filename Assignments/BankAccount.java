/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: BankAccount.java
// SPECIFICATION: The Bank Account class is an abstract superclass. The Bank Account class contains constructors to setup the account and basic methods of withdrawing, depositing, accessing, and transferring the balance amount.
// FOR: CS1400 - Assignment #7
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

public abstract class BankAccount {
    private double balance;

    /**
     * The no argument constructor to setup a bank account with a balance of 0.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * The bank account constructor to setup a bank account with an initial balance.
     * @param initialBalance the balance to initially set the bank account to
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * The deposit method adds the designated amount to the bank account balance.
     * @param amount the amount to be added to the balance
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * The withdraw method subtracts the designated amount from the bank account balance.
     * @param amount the amount to be subtracted from the balance
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * The getBalance method returns the current bank account balance.
     * @return the bank account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * The transfer method transfers the designated amount from one bank account balance to the other bank account balance.
     * @param amount the amount to transfer to the other bank account
     * @param other the bank account to transfer the amount to
     */
    public void transfer(double amount, BankAccount other) {
        if (balance >= amount) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    /**
     * The abstract method to close the bank account.
     * @param other the bank account to be closed
     */
    public abstract void close(BankAccount other);
}