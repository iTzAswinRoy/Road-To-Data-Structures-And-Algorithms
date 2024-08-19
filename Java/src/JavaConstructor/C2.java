package JavaConstructor;

// Parameterized Constructor: Write a class Car that takes make, model, and year as parameters and initializes them.
public class C2 {
    private String make;
    private String model;
    private int year;

    public C2(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        C2 car1 = new C2("Audi","R8",2021);
        C2 car2 = new C2("Benz","S-class",2025);
        C2 car3 = new C2("Honda","Civic",1990);

        System.out.println("Car 1: " + car1.getMake() + ", " + car1.getModel() + ", " + car1.getYear());
        System.out.println("Car 2: " + car2.getMake() + ", " + car2.getModel() + ", " + car2.getYear());
        System.out.println("Car 3: " + car3.getMake() + ", " + car3.getModel() + ", " + car3.getYear());
    }
}