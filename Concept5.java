/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept5;
abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Abstract method for depositing money
    abstract void deposit(double amount);

    // Abstract method for withdrawing money
    abstract void withdraw(double amount);

    // Concrete method to display balance
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Concrete class representing a savings account
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
    }

    @Override
    void withdraw(double amount) {
        // Assuming no special handling for withdrawals in this example
        balance -= amount;
    }
}

public class Concept5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount savingsAccount = new SavingsAccount("S12345", 2.5);

        // Depositing and withdrawing money
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);

        // Displaying the balance
        savingsAccount.displayBalance();
    }
}
