package JavaConstructor;

//Implement a class 'Employee' with fields name and salary.
// Use the 'this' keyword in the constructor to differentiate between the class fields and parameters.
public class Employee {          // Creating a class named 'Employee'
    // Creating instance variables for the class
    private String name;        // Crating a variable to store the name
    private int salary;      // Crating a variable to store the salary

    Employee(String name, int salary) {      // Creating a parameterized constructor that takes two arguments
        // Initialing values to the instance variables
        this.name = name;
        this.salary = salary;
    }

    public String getName() {       // Creating a getter method to get the instance variable name
        return name;        // Returning the value of name
    }

    public int getSalary() {        // Creating a getter method to get the instance variable salary
        return salary;      // Returning the value of salary
    }

    public void employeeDetails() {     // Creating a method to display the employee details
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {        // Main method
        Employee employee = new Employee("Aswin", 20000);     // Creating an objects by passing arguments

        employee.employeeDetails();      // Calling the method to display the fields
    }
}
