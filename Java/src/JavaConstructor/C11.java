package JavaConstructor;

// Write a class BankAccount with a constructor that throws an exception if the initial balance is negative.
public class C11 {      // Creating a class named 'BankAccount' that contains 'balance'
    // Creating instance variables for the class
    private int balance;        // Crating a variable to store the balance

    C11(int balance) {      // Creating a parameterized constructor that takes one argument
        // Initialing values to the instance variables
        this.balance = balance;
    }

    public int getBalance() {       // Creating a getter method to get the instance variable balance
        return balance;
    }

    public void withdrawn(int amount) {         // Creating a method to perform withdrawn
        if (amount > balance) {         // Checking if the amount is greater than balance
            throw new IllegalArgumentException("Insufficient fund!, money cant be withdrawn.");     // Throws exception with a message
        } else if (amount < 0) {        // Checking if the amount is less than 0
            throw new IllegalArgumentException("Amount should be in positive.");        // Throws exception with a message
        } else {
            balance -= amount;      // Here, the balance calculation takes place
        }
    }

    public void deposit(int amount) {       // Creating a method to perform deposit  the amount
        if (amount < 0) {       // Checking if the amount is less than 0
            throw new IllegalArgumentException("Invalid amount!");      // Throws exception with a message
        } else {
            balance += amount;      // Here, the balance calculation takes place
        }
    }

    public static void main(String[] args) {        // Main method
        C11 obj = new C11(100);         // Creating an objects by passing 1 parameter
        try {       // Performing try-catch method to handle exceptions
            obj.deposit(500);       // Calling the deposit method
            obj.withdrawn(-300);        // Calling the withdrawn method

        } catch (IllegalArgumentException e) {      // In catch block, we're creating a name of the exception with an object
            System.err.println("Transaction cancelled");        // Displaying the default error message
            System.out.println(e.getMessage());         // Calling the error message which has been thrown during execution
        }
        System.out.println("Your current balance is " + obj.getBalance());      // Displaying the current balance
    }
}
