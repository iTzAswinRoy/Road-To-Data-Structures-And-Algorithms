package JavaConstructor;

// Write a class Computer with an inner class Processor. Initialize the Processor using the outer class's constructor.
public class C14 {      //
    private String brand;       //
    private Processor processor;

    C14(String brand, int ram, int storage, int graphicsCard) {
        this.brand = brand;     //
        this.processor = new Processor(ram, storage, graphicsCard);     //
    }

    public String getBrand() {
        return brand;
    }

    public void displayDetails() {
        System.out.println("Computer brand: " + getBrand());
        processor.getProcessorDetails();
    }

    class Processor {
        int ram;
        int storage;
        int graphicsCard;

        Processor(int ram, int storage, int graphicsCard) {
            this.ram = ram;
            this.storage = storage;
            this.graphicsCard = graphicsCard;
        }

        public int getRam() {
            return ram;
        }

        public int getStorage() {
            return storage;
        }

        public int getGraphicsCard() {
            return graphicsCard;
        }

        public void getProcessorDetails(){
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
