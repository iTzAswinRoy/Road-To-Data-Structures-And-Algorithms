package JavaConstructor;

// Create a class Student with a copy constructor that copies the values of name and grade from another Student object.
public class C4 {        // Creating a class that contains car details
    // Creating instance variables for the class
    private String name;        // Crating a variable to store the name
    private String grade;       // Crating a variable to store the grade

    C4(String name, String grade) {         // Creating a parameterized constructor that takes 2 arguments
        // Initialing values to the instance variables
        this.name = name;
        this.grade = grade;
    }

    C4(C4 obj) {        // Creating a parameterized constructor by passing an object arguments
        // Initialing values to the instance variables from the object
        this.name = obj.name;
        this.grade = obj.grade;
    }

    public String getName() {       // Creating a getter method to get the instance variable name
        return name;        // Returning the value of name
    }

    public String getGrade() {      // Creating a getter method to get the instance variable grade
        return grade;       // Returning the value of grade
    }

    public static void main(String[] args) {        // Main method
        C4 obj1 = new C4("Aswin", "12th");      // Creating an objects by passing arguments
        C4 obj2 = new C4(obj1);     // Here, we're passing the objet that holds values for the instance variable

        // Displaying the object's parameter using the getter method
        System.out.println("Name:"+obj2.getName());
        System.out.println("Grade:"+obj2.getGrade());
    }
}
