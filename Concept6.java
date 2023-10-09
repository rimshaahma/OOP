/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept6;
class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;

    // Public constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public methods for accessing and modifying private attributes
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public method for displaying balance (read-only)
    public void getBalance() {
        System.out.println(balance);
    }

    // Public method for depositing money
    public void deposit(double amount) {
        // Add validation or other logic if needed
        balance += amount;
    }

    // Public method for withdrawing money
    public void withdraw(double amount) {
        // Add validation or other logic if needed
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
public class Concept6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     BankAccount ab= new BankAccount("4434", 67777);
     ab.deposit(6000);
     ab.getBalance();
    }
}
