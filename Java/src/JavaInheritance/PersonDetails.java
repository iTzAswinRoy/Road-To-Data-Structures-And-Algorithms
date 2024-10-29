package JavaInheritance;

// Write a Java program to create a class known as 'Person' with methods called getFirstName() and getLastName().
// Create a subclass called 'Employee' that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
class Person {       // Created a class called 'Person'
    // Creating instance variables for the class
    private String firstName;
    private String lastName;

    Person(String first_name, String last_name) {       // Creating a parameterized constructor that takes two argument
        // Initializing value's to the instance variable
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public String getFirstName() {      // Creating a getter method to get the instance variable 'firstName'
        return firstName;
    }
    public String getLastName() {       // Creating a getter method to get the instance variable 'lastName'
        return lastName;
    }
    public String getFullName() {       // Creating a getter method to get the instance variable 'FullName'
        return firstName + " " + lastName;
    }
}

class Employee extends Person {     // Creating a class named 'Employee' that extends 'Person'
    // Creating instance variables for the class
    private String jobTitle;
    private int employeeId;

    Employee(String first_name, String last_name, String job_title, int employee_id) {      // Creating a parameterized constructor that takes 4 argument
        super(first_name, last_name);       // Using 'super' keyword to access the parent class variables

        // Initializing value's to the instance variable
        this.jobTitle = job_title;
        this.employeeId = employee_id;
    }

    public int getEmployeeId() {        // Creating a getter method to get the instance variable 'employeeId'
        return employeeId;
    }

    @Override
    public String getLastName() {       // Creating a getter method to get the instance variable 'getLastName'
        return super.getLastName() + ", " + jobTitle;
    }
}

public class PersonDetails {      // Creating a main class containing 'PersonDetails'
    public static void main(String[] args) {        // Main method
        // Creating an object of class 'Person'
        Person prsn = new Person("Aswin", "Roy");

        // Displaying the 'person' properties using the getter methods
        System.out.println("Person first name: " + prsn.getFirstName());
        System.out.println("Person last name: " + prsn.getLastName());
        System.out.println("Person full name: " + prsn.getFullName());
        System.out.println();

        // Creating an object of class 'Employee'
        Employee emp = new Employee("Optimus", "Prime", "Auto bot", 1);

        // Displaying the 'employee' properties using the getter methods
        System.out.println("Employee first name: " + emp.getFirstName());
        System.out.println("Employee last name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}