package JavaConstructor;

// Create a base class 'Vehicle' with a constructor that initializes brand.
// Then, create a derived class 'Bike' that uses super() to call the base class constructor.
class Vehicle {      // Vehicle class
    // Creating instance variables for the class
    private String brand;

    Vehicle(String brand) {      // Creating a parameter constructor by passing the value
        // Initializing values to the instance variable
        this.brand = brand;
    }

    public String getBrand() {      // Creating a getter method to get the instance variable brand
        return brand;
    }
}

class Bike extends Vehicle {        // Creating a 'Bike' class that extends 'Vehicle' class
    // Creating instance variables for the class 'Bike'
    private int year;

    public Bike(String brand, int year){        // Creating a parameter constructor by passing the value
        // Calling the constructor of the parent class 'Vehicle' first
        super(brand);
        // Initializing values to the instance variable
        this.year = year;
    }

    public int getYear() {      // Creating a getter method to get the instance variable 'year'
            return year;
        }
}

public class Transport {      // Creating a class called 'Transport'
    public static void main(String[] args) {        // Main method
        // Creating an objects of class 'Bike' by passing arguments based on its constructor
        Bike obj = new Bike("Yamaha", 2020);

        // Displaying the object's parameter using the getter method
        System.out.println("Brand name: " + obj.getBrand());
        System.out.println("Model year: " + obj.getYear());
    }
}
