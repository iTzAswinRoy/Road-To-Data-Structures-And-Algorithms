package JavaConstructor;

//Implement a class Employee with fields name and salary.
// Use the 'this' keyword in the constructor to differentiate between the class fields and parameters.
public class C10 {
    private String name;
    private int salary;

    C10(String name, int salary){
        this. name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void employeeDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        C10 employee = new C10("Aswin", 20000);

        employee.employeeDetails();
    }
}
