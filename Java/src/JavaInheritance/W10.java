package JavaInheritance;
//  Write a Java program that creates a class hierarchy for employees of a company.
//  The base class should be Employee, with subclasses Manager, Developer, and Programmer.
//  Each subclass should have properties such as name, address, salary, and job title.
//  Implement methods for calculating bonuses, generating performance reports, and managing projects.
class CompanyEmployee {
    private String name;
    private String address;
    private int salary;
    private String jobTitle;
    CompanyEmployee(String name, String address, int salary, String jobTitle){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getSalary() {
        return salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
}
class Manager extends CompanyEmployee{
    Manager(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    public void calculatingBonus(){
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.5));
    }
    public void performanceReport(){
        System.out.println("Performance report for "+ getJobTitle() + " " + getName() + ": Excellent");
    }
    public void managingProjects() {
        System.out.println("Manager " + getName() + " is managing a project.");
    }
}
class Developer extends CompanyEmployee {
    Developer(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
    public void calculatingBonus() {
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.25));
    }
    public void performanceReport() {
        System.out.println("Performance report for " + getJobTitle() + " " + getName() + ": Good");
    }
    public void codeDevelopment() {
        System.out.println("Developer " + getName() + " is working on projects.");
    }
}
class Programmer extends CompanyEmployee {      // Sub class
    Programmer(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
    public void calculatingBonus() {
        System.out.println("Salary bonus for "+ getJobTitle()+ "is " + (getSalary() * 0.15));
    }
    public void performanceReport() {
        System.out.println("Performance report for " + getJobTitle() + " " + getName() + ": Not bad");
    }
    public void coding() {
        System.out.println("Developer "+ getName() +" is writing code.");
    }
}
public class W10 {    // Main class
    public static void main(String[] args) {    // main method
        Manager manager = new Manager("Harold", "Mumbai", 500000, "Manager");
        Developer developer = new Developer("Aswin", "Chennai", 250000, "Developer");
        Programmer programmer = new Programmer("Sam", "Kerala", 150000, "Programmer");
        manager.managingProjects();
        manager.performanceReport();
        manager.calculatingBonus();
        System.out.println();

        developer.codeDevelopment();
        developer.performanceReport();
        developer.calculatingBonus();
        System.out.println();

        programmer.coding();
        programmer.performanceReport();
        programmer.calculatingBonus();
    }
}
