package JavaConstructor;

//Create a class Point that has three constructors:
// one with no parameters, one with two parameters (x, y), and one with three parameters (x, y, z). Use constructor chaining.
public class C7 {       // Creating a class named 'Point' which contains (x, y, z)
    // Creating instance variables for the class
    private int x;
    private int y;
    private int z;

    C7() {      // Creating a default constructor
        // Initialing values to the instance variables
        this(0, 0, 0);
    }

    // Constructor with two parameters (x, y)
    C7(int x, int y) {
        // Initialing values to the instance variables

        this(x,y, 0);       // Here, the 'z' variable is assigned to 0
    }

    // Constructor with three parameters (x, y, z)
    C7(int x, int y, int z) {
        // Initialing values to the instance variables
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        C7 obj1 = new C7();      // Creating an objects by no arguments

        System.out.println("Value of x: " + obj1.x + "\nValue of y: " + obj1.y + "\nValue of z: " + obj1.z);     // Displaying the object's parameter using the getter method


        C7 obj2 = new C7(5, 10);        // Creating an objects by passing only 2 arguments
        System.out.println("\nValue of x: " + obj2.x + "\nValue of y: " + obj2.y + "\nValue of z: " + obj2.z);       // Displaying the object's parameter using the getter method


        C7 obj3 = new C7(20,30,40);         // Creating an objects by passing 3 arguments
        System.out.println("\nValue of x: " + obj3.x + "\nValue of y: " + obj3.y + "\nValue of z: " + obj3.z);      // Displaying the object's parameter using the getter method
    }
}
