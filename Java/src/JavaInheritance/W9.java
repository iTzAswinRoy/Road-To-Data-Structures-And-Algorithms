package JavaInheritance;
// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
// Each subclass should have properties such as company, model, year, and fuel type.
// Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
class Vehicle {
    private String company;
    private String model;
    private int year;
    private String fuelType;
    private int fuelEfficiency;
    Vehicle(String company, String model, int year, String fuelType, int fuelEfficiency) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    public String getCompany() {
        return company;
    }
    public String getModel() {
        return model;
    }
    public String getFuelType() {
        return fuelType;
    }
    public int getFuelEfficiency(){
        return fuelEfficiency;
    }
}

class Truck extends Vehicle{
    private int distance;
    private int maxSpeed;

    Truck(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {
        super(company, model, year, fuelType, fuelEfficiency);
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }
    public int calculatingFuelEfficiency() {
        return getFuelEfficiency();
    }
    public int distanceTraveled() {
        return distance;
    }
    public int maximumSpeed() {
        return maxSpeed;
    }
}

class Car extends Vehicle {
    private int distance;
    private int maxSpeed;

    Car(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {
        super(company, model, year, fuelType, fuelEfficiency);
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }
    public int calculatingFuelEfficiency() {
        return getFuelEfficiency();
    }
    public int distanceTraveled() {
        return distance;
    }
    public int maximumSpeed() {
        return maxSpeed;
    }
}

class Motorcycle extends Vehicle {
    private int distance;
    private int maxSpeed;

    Motorcycle(String company, String model, int year, String fuelType, int fuelEfficiency, int distance, int maxSpeed) {
        super(company, model, year, fuelType, fuelEfficiency);
        this.distance = distance;
        this.maxSpeed = maxSpeed;
    }
    public int calculatingFuelEfficiency() {
        return getFuelEfficiency();
    }
    public int distanceTraveled() {
        return distance;
    }
    public int maximumSpeed() {
        return maxSpeed;
    }
}

public class W9 {
    public static void main(String[] args) {
        Car car = new Car("Ford","GT", 1995, "Petrol", 20, 15000, 240);
        Motorcycle bike = new Motorcycle("Ducati", "Panigale",2019 ,"Petrol", 35, 20000, 260);
        Truck truck = new Truck("Ford","L&T", 1998, "Diesel", 12, 600000, 160);

        System.out.println("Car Model: " + car.getCompany() + " " + car.getModel());
        System.out.println("Fuel type: " + car.getFuelType());
        System.out.println("Fuel Efficiency: " + car.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + car.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + car.maximumSpeed() + " kmph\n");

        System.out.println("Motorcycle Model: "+ bike.getCompany() + " " + bike.getModel());
        System.out.println("Fuel type: " + bike.getFuelType());
        System.out.println("Fuel Efficiency: " + bike.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + bike.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + bike.maximumSpeed() + " kmph\n");

        System.out.println("Truck Model: "+ truck.getCompany() + " " + truck.getModel());
        System.out.println("Fuel type: " + truck.getFuelType());
        System.out.println("Fuel Efficiency: " + truck.calculatingFuelEfficiency() + " L");
        System.out.println("Distance Traveled: " + truck.distanceTraveled() + " Kilometers");
        System.out.println("Max Speed: " + truck.maximumSpeed() + " kmph\n");
    }
}
