package JavaInheritance;
// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 class BankAccount{     // Created a class, named bank account
    private int balance;    // Creating a private variable to store the balance
    BankAccount(int initialBalance){     // Creating a constructor to initialize the balance
        this.balance = initialBalance;      // Using 'this' keyword, initializing the variable
    }
    public void deposit(int amount) {   // Method to deposit the money
        if(amount > 0) {    // Checking if the given money is greater than 0
            balance += amount;      // Adding up the balance the given amount
            System.out.println("Amount deposited: "+amount);    // Displaying the amount
        } else {
            System.out.println("Invalid amount");   // Condition if the amount doesn't contain any negative value
        }
    }
    public void withdraw(int amount) {      // Method to withdraw the amount
        if(amount > 0 && balance >= amount){    // Checking if the amount is not less than the accounts balance
            balance -= amount;
            System.out.println("Amount withdrawn: "+amount);
        }
    }
    public int getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount{
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

 public class w5 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(100);

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