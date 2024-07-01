package W3Resource.JavaInheritance;
// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class w5 {     // Created a class names bank account
    private int balance;
    w5(int initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: "+amount);
        } else {
            System.out.println("Invalid amount: ");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && balance >= amount){
            balance =- amount;
            System.out.println("Amount withdrawn: "+amount);
        }
    }
    public int getBalance() {
        return balance;
    }
}
class SavingsAccount extends w5{
    SavingsAccount(int initialBalance) {
        super(initialBalance);
    }
    public void withdraw(int amount) {
        if(getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Access denied. Entered amount is less than the minimum balance.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        
    }
}