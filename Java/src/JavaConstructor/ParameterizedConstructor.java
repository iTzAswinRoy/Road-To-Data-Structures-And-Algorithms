package JavaConstructor;

// Write a class Car that takes make, model, and year as parameters and initializes them.
public class ParameterizedConstructor {       // Creating a class that contains car details
    // Creating instance variables for the class
    private String manufacture;        // Crating a variable to store car manufacture details
    private String model;       // Crating a variable to store car model details
    private int year;       // Crating a variable to store year

    public ParameterizedConstructor(String manufacture, String model, int year) {         // Creating a parameterized constructor by passing arguments
        // Initialing values to the instance variables
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    public String getManufacture() {        // Creating a getter method to get the instance variable manufacture
        return manufacture;         // Returning the value of manufacture
    }

    public String getModel() {      // Creating a getter method to get the instance variable model
        return model;       // Returning the value of model
    }

    public int getYear() {      // Creating a getter method to get the instance variable year
        return year;        // Returning the value of year
    }

    public static void main(String[] args) {        // Main method
        // Creating multiple objects of the same class
        ParameterizedConstructor car1 = new ParameterizedConstructor("Audi","R8",2021);
        ParameterizedConstructor car2 = new ParameterizedConstructor("Benz","S-class",2025);
        ParameterizedConstructor car3 = new ParameterizedConstructor("Honda","Civic",1990);

        // Displaying the object's parameter using the getter method
        System.out.println("Car 1: " + car1.getManufacture() + ", " + car1.getModel() + ", " + car1.getYear());
        System.out.println("Car 2: " + car2.getManufacture() + ", " + car2.getModel() + ", " + car2.getYear());
        System.out.println("Car 3: " + car3.getManufacture() + ", " + car3.getModel() + ", " + car3.getYear());
    }
}