package JavaConstructor;

// Write a class Computer with an inner class Processor. Initialize the Processor using the outer class's constructor.
public class C14 {      // Creating a class named 'Computer' that contains 'database'
    // Creating instance variables for the class
    private String brand;       // Crating a variable to store the 'brand'
    private Processor processor;        // Crating a reference variable of class 'processor'

    C14(String brand, int ram, int storage, int graphicsCard) {         // Creating a parameterized constructor that takes 3 arguments
        // Initialing values to the instance variables
        this.brand = brand;
        this.processor = new Processor(ram, storage, graphicsCard);         // Initialling values to new object of class 'processor' type
    }

    public String getBrand() {      // Creating a getter method to get the instance variable brand
        return brand;        // Returning the brand
    }

    public void displayDetails() {          // Method to display the details
        System.out.println("Computer brand: " + getBrand());        // Calling the getter method to display the instance variable
        processor.getProcessorDetails();        //
    }

    class Processor {       //
        int ram;        //
        int storage;//
        int graphicsCard;//

        Processor(int ram, int storage, int graphicsCard) {     //
            this.ram = ram;//
            this.storage = storage;     //
            this.graphicsCard = graphicsCard;//
        }

        public int getRam() {       //
            return ram;
        }

        public int getStorage() {//
            return storage;
        }

        public int getGraphicsCard() {
            return graphicsCard;
        }

        public void getProcessorDetails() {
            System.out.println("Processor details:");
            System.out.println("Ram: " + getRam());
            System.out.println("Storage: " + getStorage());
            System.out.println("Graphics card: " + getGraphicsCard());
        }
    }

    public static void main(String[] args) {
        C14 cmp = new C14("Intel", 120, 8, 4);

        cmp.displayDetails();
    }
}
