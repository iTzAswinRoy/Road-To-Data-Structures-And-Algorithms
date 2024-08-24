package JavaConstructor;

// Write a class BankAccount with a constructor that throws an exception if the initial balance is negative.
public class C11 {
    private int balance;

    C11(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawn(int amount){
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient fund!, money cant be withdrawn.");
        } else if(amount < 0) {
            throw new IllegalArgumentException("Amount should be in positive.");
        } else {
            balance -= amount;
        }
    }

    public void deposit(int amount){
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount!");
        } else {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        C11 obj = new C11(100);
        try {
            obj.deposit(500);
            obj.withdrawn(300);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.err.println("Transaction cancelled");
        }
        System.out.println("Your current balance is "+obj.getBalance());

    }
}
