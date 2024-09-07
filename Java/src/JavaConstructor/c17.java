package JavaConstructor;

// Create an abstract class Shape with a constructor that initializes color. Then, implement a concrete class Circle that extends Shape.
abstract class Shape {      //
    private String color;       //

    Shape(String colour){       //
        this.color = colour;
    }

    public abstract double area(int radius);        //

    public abstract double perimeter(int radius);       //

    public String getColor() {      //
        return color;
    }
}

public class c17 extends Shape {        //
    private int radius;

    c17(String color, int radius) {     //
        super(color);
        this.radius = radius;
    }

    public double area(int radius) {        //
        return Math.PI * radius * radius;
    }

    public double perimeter(int radius) {       //
        return 2 * Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        c17 obj = new c17("red", 5);

        System.out.println("area of the circle:\n" + obj.area(obj.getRadius()));

        System.out.println("Perimeter of the circle:\n" + obj.perimeter(obj.getRadius()));
    }
}
