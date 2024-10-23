package JavaConstructor;

// Write a class 'Computer' with an inner class Processor. Initialize the Processor using the outer class's constructor.
public class Computer {      // Creating a class named 'Computer'
    // Creating instance variables for the class
    private String brand;       // Crating a variable to store the 'brand'
    private Processor processor;        // Crating a reference variable of class 'processor'

    Computer(String brand, int ram, int storage, int graphicsCard) {         // Creating a parameterized constructor that takes 3 arguments
        // Initialing values to the instance variables
        this.brand = brand;
        this.processor = new Processor(ram, storage, graphicsCard);         // Initialling values to new object of class 'processor' type
    }

    public String getBrand() {      // Creating a getter method to get the instance variable 'brand'
        return brand;        // Returning the brand
    }

    public void displayDetails() {          // Method to display the details
        System.out.println("Computer brand: " + getBrand());        // Calling the getter method to display the instance variable
        processor.getProcessorDetails();        //
    }

    class Processor {       // Creating a subclass class named 'Processor'
        // Creating instance variables for the class
        int ram;
        int storage;
        int graphicsCard;

        Processor(int ram, int storage, int graphicsCard) {         // Creating a parameterized constructor by passing arguments
            // Initialing values to the instance variables
            this.ram = ram;
            this.storage = storage;
            this.graphicsCard = graphicsCard;
        }

        public int getRam() {       // Creating a getter method to get the instance variable 'Ram'
            return ram;
        }

        public int getStorage() {       // Creating a getter method to get the instance variable 'Storage'
            return storage;
        }

        public int getGraphicsCard() {      // Creating a getter method to get the instance variable 'GraphicsCard'
            return graphicsCard;
        }

        public void getProcessorDetails() {      // Method to display the processor details
            // Displaying the object's parameter using the getter method
            System.out.println("Processor details:");
            System.out.println("Ram: " + getRam());
            System.out.println("Storage: " + getStorage());
            System.out.println("Graphics card: " + getGraphicsCard());
        }
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of class 'Computer' by passing arguments
        Computer cmp = new Computer("Intel", 120, 8, 4);

        // Calling the method to display the details
        cmp.displayDetails();
    }
}