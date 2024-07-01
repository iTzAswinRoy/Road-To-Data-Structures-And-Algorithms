package W3Resource.JavaInheritance;
// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
// Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
class Person {       // Created a class called person
    private String firstName;
    private String lastName;
    Person(String first_name, String last_name){
        this.firstName = first_name;
        this.lastName = last_name;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName() {
        return firstName+" "+lastName;
    }
}
class Employee extends Person{
    private String jobTitle;
    private int employeeId;
    Employee(String first_name, String last_name, String job_title, int employee_id) {
        super(first_name, last_name);
        this.jobTitle = job_title;
        this.employeeId = employee_id;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    @Override
    public String getLastName() {
        return super.getLastName()+", "+jobTitle;
    }
}
public class w7 {
    public static void main(String[] args) {
        Person psrn = new Person("Aswin", "Roy");
        System.out.println("Person first name: "+psrn.getFirstName());
        System.out.println("Person last name: "+psrn.getLastName());
        System.out.println("Person full name: "+psrn.getFullName());
        System.out.println();

        Employee emp = new Employee("Optimus", "Prime", "Auto bot", 1);
        System.out.println("Employee first name: "+emp.getFirstName());
        System.out.println("Employee last name: "+emp.getLastName());
        System.out.println("Employee ID: "+emp.getEmployeeId());


    }
}
