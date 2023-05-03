/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: SavingsAccount.java
// SPECIFICATION: The Savings Account class is a subclass of the Bank Account class. The Savings Account class has constructors to setup a savings account, a method to add the interest earned, a method to close the account.
// FOR: CS1400 - Assignment #7
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

public class SavingsAccount extends BankAccount {
    private double interestRate;

    /**
     * The savings account constructor to setup a savings account with a balance of 0. The interest rete is set to the value defined in the parameter.
     * @param rate the interest rate to be defined for the savings account
     */
    public SavingsAccount(double rate) {
        super(0);
        interestRate = rate;
    }

    /**
     * The savings account constructor to setup a savings account with an initial balance. The interest rate is set to the value defined in the parameter.
     * @param rate the interest rate to be defined for the savings account
     * @param initialBalance the balance to initially set the bank account to
     */
    public SavingsAccount(double rate, double initialBalance) {
        super(initialBalance);
        interestRate = rate;
    }
    
    /**
     * The addInterest method adds the interest earned by calling the superclass deposit method with the parameter value of the balance multiplied with the interest rate.
     */
    public void addInterest() {
        super.deposit(this.getBalance() * interestRate);
    }

    /**
     * The close method calls the superclass transfer method and transfers the amount of the savings account to the other bank account.
     */
    public void close(BankAccount other) {
        super.transfer(this.getBalance(), other);
    }
}