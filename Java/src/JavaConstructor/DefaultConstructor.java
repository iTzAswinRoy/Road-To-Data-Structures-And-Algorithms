package JavaConstructor;

// Create a class Person with a default constructor that initializes name to "Aswin" and age to 20.
public class DefaultConstructor {       // Creating a class that contains person details
    // Creating instance variable for the class
    private String name;        // Creating instance variable to store name
    private int age;        // Creating instance variable to store age

    public DefaultConstructor() {       // Creating default constructor
        // Initializing default values to the instance variable
        this.name = "Aswin";
        this.age = 20;
    }

    public String getName() {       // Creating a getter method to get the instance variable name
        return name;      // Returning name
    }

    public int getAge() {       // Creating a getter method to get the instance variable age
        return age;     // Returning age
    }

    public void setAge(int age) {       // Creating a setter method to assign the age under certain conditions
        // Setting the age only if the value of age satisfies the condition
        if (age < 70) {
            this.age = age;
        }
    }

    public static void main(String[] args) {        // Main method
        DefaultConstructor obj = new DefaultConstructor();      // Creating an object of the class type
        obj.setAge(45);     // Setting the age the setter method

        // Accessing the name and age using getter method
        System.out.println("My name is " + obj.getName());
        System.out.println("My age is " + obj.getAge());
    }
}

