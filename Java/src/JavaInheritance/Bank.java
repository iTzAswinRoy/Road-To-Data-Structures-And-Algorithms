package JavaInheritance;

// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 class BankAccount {     // Created a class, named bank account
    private int balance;    // Creating a private variable to store the balance

    BankAccount(int initialBalance) {     // Creating a constructor to initialize the balance
        // Initializing value's to the instance variable
        this.balance = initialBalance;
    }

    public void deposit(int amount) {   // Method to deposit the money
        if (amount > 0) {    // Checking if the given money is greater than 0
            balance += amount;      // Adding up the balance the given amount
            System.out.println("Amount deposited: " + amount);    // Displaying the amount
        } else {
            System.out.println("Invalid amount");   // Condition if the amount doesn't contain any negative value
        }
    }

    public void withdraw(int amount) {      // Method to withdraw the amount
        if(amount > 0 && balance >= amount) {    // Checking if the amount is not less than the accounts balance
            balance -= amount;
            System.out.println("Amount withdrawn: "+amount);
        }
    }

    public int getBalance() {       // Creating a getter method to get the instance variable balance
        return balance;
    }
}

class SavingsAccount extends BankAccount {      // Creating a class named 'SavingsAccount' that extends 'BankAccount'
    SavingsAccount(int initialBalance) {        // Creating a parameterized constructor that takes one argument
        super(initialBalance);      // Using 'super' keyword to access the parent class variables
    }

    public void withdraw(int amount) {      // Method to withdraw the amount
        if(getBalance() - amount >= 100) {      // Condition to check if the amount to withdraw is lesser than minimum balance
            super.withdraw(amount);         // Calling the parent class method using 'super' keyword
        } else {
            System.out.println("Transaction declined. Cause the minimum balance shouldn't be less than 100.");      // Displays error message
        }
    }
}

 public class Bank {        // Creating a class containing 'bank' properties
    public static void main(String[] args) {        // Main method
        // Creating an object of class 'BankAccount'
        BankAccount bank = new BankAccount(100);

        // Performing bank transaction process
        bank.deposit(10);
        bank.withdraw(100);

        // Displaying the current balance
        System.out.println("Bank account balance is " + bank.getBalance());
        System.out.println();

        // Creating an object of class 'SavingsAccount'
        SavingsAccount savings = new SavingsAccount(200);

        // Performing bank transaction process
        savings.deposit(500);
        savings.withdraw(100);

        // Displaying the current balance
        System.out.println("Saving's account balance is " + savings.getBalance());
    }
}