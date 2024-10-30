package JavaInheritance;

//  Write a Java program that creates a class hierarchy for employees of a company.
//  The base class should be Employee, with subclasses Manager, Developer, and Programmer.
//  Each subclass should have properties such as name, address, salary, and job title.
//  Implement methods for calculating bonuses, generating performance reports, and managing projects.
class CompanyEmployee {         // Created a class called 'CompanyEmployee'
    // Creating instance variables for the class
    private String name;
    private String address;
    private int salary;
    private String jobTitle;

    // Creating a parameterized constructor that takes 4 argument
    CompanyEmployee(String name, String address, int salary, String jobTitle) {
        // Initializing value's to the instance variable
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {       // Creating a getter method to get the instance variable 'name'
        return name;
    }

    public String getAddress() {        // Creating a getter method to get the instance variable 'address'
        return address;
    }

    public int getSalary() {        // Creating a getter method to get the instance variable 'salary'
        return salary;
    }

    public String getJobTitle() {       // Creating a getter method to get the instance variable 'jobTitle'
        return jobTitle;
    }
}

class Manager extends CompanyEmployee {      // Creating a class named 'Manager' that extends 'CompanyEmployee'

    // Creating a parameterized constructor that takes 4 argument
    Manager(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);         // Using 'super' keyword to access the parent class variables
    }

    public void calculatingBonus() {        // Method to calculate the bonus
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.5));
    }

    public void performanceReport() {       // Method to display the performance report
        System.out.println("Performance report for "+ getJobTitle() + " " + getName() + ": Excellent");
    }

    public void managingProjects() {        // Method to display the project manager
        System.out.println("Manager " + getName() + " is managing a project.");
    }
}

class Developer extends CompanyEmployee {       // Creating a class named 'Developer' that extends 'CompanyEmployee'

    // Creating a parameterized constructor that takes 4 argument
    Developer(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);         // Using 'super' keyword to access the parent class variables
    }

    public void calculatingBonus() {        // Method to calculate the bonus
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.25));
    }

    public void performanceReport() {       // Method to display the performance report
        System.out.println("Performance report for " + getJobTitle() + " " + getName() + ": Good");
    }

    public void codeDevelopment() {         // Method to display the code development
        System.out.println("Developer " + getName() + " is working on projects.");
    }
}

class Programmer extends CompanyEmployee {      // Creating a class named 'Programmer' that extends 'CompanyEmployee'

    // Creating a parameterized constructor that takes 4 argument
    Programmer(String name, String address, int salary, String jobTitle) {

        super(name, address, salary, jobTitle);         // Using 'super' keyword to access the parent class variables
    }

    public void calculatingBonus() {        // Method to calculate the bonus
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.15));
    }

    public void performanceReport() {       // Method to display the performance report
        System.out.println("Performance report for " + getJobTitle() + " " + getName() + ": Not bad");
    }

    public void coding() {      // Method to display the code development
        System.out.println("Developer "+ getName() +" is writing code.");
    }
}

public class Company {          // Creating a main class 'Transport' containing all the properties
    public static void main(String[] args) {        // main method

        // Creating an object of their respective class
        Manager manager = new Manager("Harold", "Mumbai", 500000, "Manager");
        Developer developer = new Developer("Aswin", "Chennai", 250000, "Developer");
        Programmer programmer = new Programmer("Sam", "Kerala", 150000, "Programmer");

        // Calling the properties of 'Manager' class using the getter methods
        manager.managingProjects();
        manager.performanceReport();
        manager.calculatingBonus();
        System.out.println();

        // Calling the properties of 'Developer' class using the getter methods
        developer.codeDevelopment();
        developer.performanceReport();
        developer.calculatingBonus();
        System.out.println();

        // Calling the properties of 'Programmer' class using the getter methods
        programmer.coding();
        programmer.performanceReport();
        programmer.calculatingBonus();
    }
}