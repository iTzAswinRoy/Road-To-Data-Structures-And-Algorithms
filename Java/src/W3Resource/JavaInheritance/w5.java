package W3Resource.JavaInheritance;
// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class w5 {     // Created a class names bank account
    private int balance;    // Creating a private variable to store the balance
    w5(int initialBalance){     // Creating a constructor to initialize the balance
        this.balance = initialBalance;      // Using 'this' keyword, initializing the variable
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
            balance -= amount;
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
            System.out.println("Transaction declined. Cause the minimum balance shouldn't be less than 100.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        w5 bank = new w5(100);
        bank.deposit(10);
        bank.withdraw(100);
        System.out.println("Bank account balance is "+bank.getBalance());
        System.out.println();

        SavingsAccount savings = new SavingsAccount(200);
        savings.deposit(500);
        savings.withdraw(100);
        System.out.println("Saving's account balance is "+savings.getBalance());
    }
}