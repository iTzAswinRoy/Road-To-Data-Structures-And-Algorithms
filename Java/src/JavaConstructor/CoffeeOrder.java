package JavaConstructor;

// Implement a class 'CoffeeOrder' that takes a Size enum and an extraShots parameter in the constructor.
public class CoffeeOrder {      // Creating a class named 'CoffeeOrder'
    enum Size {        // Creating an enumeration 'Size' to represent coffee sizes
        SMALL, MEDIUM, LARGE        // Enum constants for coffee sizes
    }
    // Creating instance variables for the class
    private Size size;
    private int orderCount;

    CoffeeOrder(Size size, int orderCount) {       // Creating a parameterized constructor by passing arguments
        // Initialing values to the instance variables
        this.size = size;
        this.orderCount = orderCount;
    }

    public Size getSize() {      // Creating a getter method to get the instance variable 'size'
        return size;
    }

    public int getOrderCount() {      // Creating a getter method to get the instance variable 'orderCount'
        return orderCount;
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of class 'CoffeeOrder' by passing arguments
        CoffeeOrder order = new CoffeeOrder(Size.MEDIUM, 5);

        // Calling the method to display the coffee orders
        System.out.println("Coffee order:\n------------");
        System.out.println("Size: " + order.getSize());
        System.out.println("Number of orders: " + order.getOrderCount());
    }
}