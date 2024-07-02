package W3Resource.JavaInheritance;
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
}
class Manager extends CompanyEmployee{
    Manager(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    public int calculatingBonus(){
        return
    }
    public void performanceReport(){

    }
    public void managingProjects
}
class Developer extends CompanyEmployee{
    Developer(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    public int calculatingBonus(){
        return
    }
    public void performanceReport(){

    }
}
class Programmer extends CompanyEmployee{
    Programmer(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    public int calculatingBonus(){
        return
    }
    public void performanceReport(){

    }
}

public class W10 {
    public static void main(String[] args) {

    }
}
