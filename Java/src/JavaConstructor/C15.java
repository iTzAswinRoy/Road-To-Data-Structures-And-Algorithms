package JavaConstructor;

// Implement a class CoffeeOrder that takes a Size enum and an extraShots parameter in the constructor.

public class C15 { //
    enum Size {
        SMALL, MEDIUM, LARGE //
    }

    private Size size;      //
    private int orderCount;     //

    C15(Size size, int orderCount){
        this.size = size;       //
        this.orderCount = orderCount;
    } //

    public Size getSize() { //
        return size;
    }

    public int getOrderCount() {        //
        return orderCount;
    }

    public static void main(String[] args) {
        C15 order = new C15(Size.MEDIUM, 5);

        System.out.println("Coffee order:\n------------");
        System.out.println("Size: "+order.getSize());
        System.out.println("Number of orders: "+order.getOrderCount());
    }
}
