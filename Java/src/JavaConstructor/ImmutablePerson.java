package JavaConstructor;

// Write a class 'ImmutablePerson' that has final fields and only provides a constructor for initializing these fields.
public class ImmutablePerson {      // Creating a class named 'ImmutablePerson'
    // Creating instance variables for the class
    private final String name;
    private final int age;

    ImmutablePerson(String name, int age) {     // Creating a parameterized constructor by passing arguments
        // Initialing values to the instance variables
        this.name = name;
        this.age = age;
    }

    public String getName() {       // Creating a getter method to get the instance variable 'Name'
        return name;        //
    }

    public int getAge() {       // Creating a getter method to get the instance variable 'age'
        return age;     //
    }

    public static void main(String[] args) {        // Main method
        // Creating an object of class 'ImmutablePerson' by passing arguments
        ImmutablePerson person = new ImmutablePerson("Aswin", 25);

        // Calling the method to display the person details
        System.out.println("Person details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}