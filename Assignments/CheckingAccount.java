/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: CheckingAccount.java
// SPECIFICATION: The Checking Account class is a subclass of the Bank Account class. The Checking Account class has a constructor to setup the checking account, overridden withdraw and deposit methods, method to decuct the maintenance fee, and method to close the account.
// FOR: CS1400 - Assignment #7
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

public class CheckingAccount extends BankAccount {
    private int transactionCount;
    private final int FREE_TRANSACTIONS = 3;
    private final double TRANSACTION_FEE  = 2.0;
    private final double CLOSING_FEE = 5.0;
    private final double MAINTENANCE_FEE = 10.0;

    /**
     * The no argument constructor to setup a checking account with a balance of 0. It sets the transaction count to 0.
     */
    public CheckingAccount() {
        super();
        transactionCount = 0;
    }

    /**
     * The checking account constructor to setup a checking account with an initial balance. It sets the transaction count to 0.
     * @param initialBalance the balance to initially set the bank account to
     */
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    /**
     * The deposit method for a checking account calls the superclass method to add the amount to the balance. The transaction count is updated and if the transaction count is more than the number of free transactions allowed, then a transaction fee is withdrawed from the balance.
     * @param amount the amount to be added to the balance
     */
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }
    
    /**
     * The withdraw method for a checking account calls the superclass method to deduct the amount from the balance. The transaction count is updated and if the transaction count is more than the number of free transactions allowed, then a transaction fee is withdrawed from the balance.
     * @param amount the amount to be subtracted from the balance
     */
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }

    /**
     * The deductMaintenanceFee method deducts the maintenance fee by calling the superclass withdraw method. The transaction count is reset to 0 for the following months.
     */
    public void deductMaintenanceFee() {
        super.withdraw(MAINTENANCE_FEE);
        transactionCount = 0;
    }

    /**
     * The close method withdraws the closing fee from the balance by calling the superclass method. The superclass transfer method is called to transfer the balance to the other bank account. The transaction count is reset to 0.
     * @param other the bank account to be closed
     */
    public void close(BankAccount other) {
        super.withdraw(CLOSING_FEE);
        super.transfer(this.getBalance(), other);
        transactionCount = 0;
    }
}