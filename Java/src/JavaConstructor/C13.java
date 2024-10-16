package JavaConstructor;

// Create a base class 'Vehicle' with a constructor that initializes brand.
// Then, create a derived class 'Bike' that uses super() to call the base class constructor.
class Vehicle {      // Vehicle class
    private String brand;       //

    Vehicle(String brand) {     //
        this.brand = brand;//
    }

    public String getBrand() {//
        return brand;//
    }
}

class Bike extends Vehicle {//
        private int year;//

        public Bike(String brand, int year){//
            super(brand);//
            this.year = year;//
        }

        public int getYear() {//
            return year;//
        }
}

public class C13 {//
    public static void main(String[] args) {//
        Bike obj = new Bike("Yamaha", 2020);

        System.out.println("Brand name: " + obj.getBrand());
        System.out.println("Model year: " + obj.getYear());
    }
}
