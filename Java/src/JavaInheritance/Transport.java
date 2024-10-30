package JavaInheritance;

// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
// Each subclass should have properties such as company, model, year, and fuel type.
// Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
class Vehicle {         // Created a class called 'Vehicle'
    // Creating instance variables for the class
    private String company;
    private String model;
    private int year;
    private String fuelType;
    private int fuelEfficiency;

    Vehicle(String company, String model, int year, String fuelType, int fuelEfficiency) {          // Creating a parameterized constructor that takes 5 argument
        // Initializing value's to the instance variable
        this.company = company;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getCompany() {        // Creating a getter method to get the instance variable 'company'
        return company;
    }

    public String getModel() {      // Creating a getter method to get the instance variable 'model'
        return model;
    }

    public String getFuelType() {       // Creating a getter method to get the instance variable 'fuelType'
        return fuelType;
    }

    public int getFuelEfficiency() {        // Creating a getter method to get the instance variable 'fuelEfficiency'
        return fuelEfficiency;
    }
}

class Truck extends Vehicle {       // Creating a class named 'Truck' that extends 'Vehicle'
    // Creating instance variables for the class
    private int distance;
    private int maxSpeed;

    Truck(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {            // Creating a parameterized constructor that takes 5 argument
        super(company, model, year, fuelType, fuelEfficiency);      // Using 'super' keyword to access the parent class variables
        // Initializing value's to the instance variable
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }

    public int calculatingFuelEfficiency() {         // Method to calculate FuelEfficiency
        return getFuelEfficiency();
    }

    public int distanceTraveled() {      // Method to calculate distance travelled
        return distance;
    }

    public int maximumSpeed() {      // Method to calculate maximum speed
        return maxSpeed;
    }
}

class Car extends Vehicle {     // Creating a class named 'Car' that extends 'Vehicle'
    // Creating instance variables for the class
    private int distance;
    private int maxSpeed;

    Car(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {      // Creating a parameterized constructor that takes 5 argument
        super(company, model, year, fuelType, fuelEfficiency);      // Using 'super' keyword to access the parent class variables
        // Initializing value's to the instance variable
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }

    public int calculatingFuelEfficiency() {        // Method to calculate fuel efficiency
        return getFuelEfficiency();
    }

    public int distanceTraveled() {         // Method to calculate distance travelled
        return distance;
    }

    public int maximumSpeed() {      // Method to calculate maximum speed
        return maxSpeed;
    }
}

class Motorcycle extends Vehicle {      // Creating a class named 'Car' that extends 'Vehicle'
    // Creating instance variables for the class
    private int distance;
    private int maxSpeed;

    Motorcycle(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {       // Creating a parameterized constructor that takes 5 argument
        super(company, model, year, fuelType, fuelEfficiency);          // Using 'super' keyword to access the parent class variables
        // Initializing value's to the instance variable
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }

    public int calculatingFuelEfficiency() {        // Method to calculate fuel efficiency
        return getFuelEfficiency();
    }

    public int distanceTraveled() {         // Method to calculate distance travelled
        return distance;
    }

    public int maximumSpeed() {         // Method to calculate maximum speed
        return maxSpeed;
    }
}

public class Transport {            // Creating a main class 'Transport' containing all the properties
    public static void main(String[] args) {        // Main method

        // Creating an object of their respective class
        Car car = new Car("Ford","GT", 1995, "Petrol", 20, 15000, 240);
        Motorcycle bike = new Motorcycle("Ducati", "Panigale",2019 ,"Petrol", 35, 20000, 260);
        Truck truck = new Truck("Ford","L&T", 1998, "Diesel", 12, 600000, 160);

        // Displaying the properties of 'Car' class using the getter methods
        System.out.println("Car Model: " + car.getCompany() + " " + car.getModel());
        System.out.println("Fuel type: " + car.getFuelType());
        System.out.println("Fuel Efficiency: " + car.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + car.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + car.maximumSpeed() + " kmph\n");

        // Displaying the properties of 'Motorcycle' class using the getter methods
        System.out.println("Motorcycle Model: "+ bike.getCompany() + " " + bike.getModel());
        System.out.println("Fuel type: " + bike.getFuelType());
        System.out.println("Fuel Efficiency: " + bike.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + bike.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + bike.maximumSpeed() + " kmph\n");

        // Displaying the properties of 'Truck' class using the getter methods
        System.out.println("Truck Model: "+ truck.getCompany() + " " + truck.getModel());
        System.out.println("Fuel type: " + truck.getFuelType());
        System.out.println("Fuel Efficiency: " + truck.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + truck.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + truck.maximumSpeed() + " kmph\n");
    }
}