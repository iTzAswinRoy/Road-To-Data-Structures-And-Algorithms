package JavaConstructor;

// Implement a class Rectangle with two constructors: one that takes length and width as parameters and another that sets both to a default value.
public class C3 {
    private int length;
    private int width;

    C3 (){
        this.length = 10;
        this.width = 15;
    }

    C3(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area(){
        return length * width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }

    public void setLength(int length) {
        if(length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive!");
        }
    }

    public static void main(String[] args) {
        C3 rectangle1 = new C3();
        System.out.println("Rectangle 1: \nLength = "+ rectangle1.getLength() + "\nWidth = "+rectangle1.getWidth());
        System.out.println("Area of the rectangle: " + rectangle1.area());
        System.out.println("Perimeter of the rectangle: " + rectangle1.perimeter());

        C3 rectangle2 = new C3(20, 5);
        System.out.println("\nRectangle 2: \nLength = "+ rectangle2.getLength() + "\nWidth = "+rectangle2.getWidth());
        System.out.println("Area of the rectangle: " + rectangle2.area());
        System.out.println("Perimeter of the rectangle: " + rectangle2.perimeter());
    }
}
