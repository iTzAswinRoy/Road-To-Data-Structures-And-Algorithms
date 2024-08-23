package JavaConstructor;

//Create a class Point that has three constructors:
// one with no parameters, one with two parameters (x, y), and one with three parameters (x, y, z). Use constructor chaining.
public class C7 {
    private int x;
    private int y;
    private int z;

    // Constructor with no parameters

    C7() {
        this(0, 0, 0);
    }

    // Constructor with two parameters (x, y)
    C7(int x, int y){
        this(x,y, 0);       // Calls the constructor with three parameters, setting z to 0
    }

    // Constructor with three parameters (x, y, z)
    C7(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        C7 obj1 = new C7();
        System.out.println("Value of x: " + obj1.x + "\nValue of y: " + obj1.y + "\nValue of z: " + obj1.z);

        C7 obj2 = new C7(5, 10);
        System.out.println("\nValue of x: " + obj2.x + "\nValue of y: " + obj2.y + "\nValue of z: " + obj2.z);

        C7 obj3 = new C7(20,30,40);
        System.out.println("\nValue of x: " + obj3.x + "\nValue of y: " + obj3.y + "\nValue of z: " + obj3.z);


    }
}
