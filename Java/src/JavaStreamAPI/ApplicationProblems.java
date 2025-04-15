package JavaStreamAPI;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ApplicationProblems {
    String name;
    int age;
    String department;
    int salary;

    ApplicationProblems(String name, int age, String department, int salary){
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + " | Age: " + getAge() + " | Department: " + getDepartment() + " | Salary: " + getSalary();
    }

// Filter Employees by specific Salary
// Calculate Total Salary
// Group Employees by Department
// Find the Youngest Employee
// Sort Employees by Age and Then by Name

    public static void main(String[] args) {
        List<ApplicationProblems> list = List.of(new ApplicationProblems("Aswin", 25, "Mech", 1000),
                new ApplicationProblems("Melwin", 30, "CSE", 5000),
                new ApplicationProblems("Joel", 20, "Mech", 2500),
                new ApplicationProblems("Abi", 25, "CSE", 1000),
                new ApplicationProblems("Joshina", 25, "IT", 2500),
                new ApplicationProblems("Nicewin", 30, "Mech", 5000),
                new ApplicationProblems("Brinda", 30, "CSE", 2500),
                new ApplicationProblems("Jona", 18, "IT", 1000));


        System.out.println("-------------------------------------------------------------------------------------------\n");
        System.out.println("Filtering employees who are earning above 2500rs:\n");

        list.stream().filter(n -> n.getSalary() > 2500).forEach(System.out::println);

        System.out.println("\n-------------------------------------------------------------------------------------------\n");

        int totalSalary = list.stream().map(emp -> emp.getSalary()).reduce(0, (a,b) -> a + b);

        System.out.println("Calculating Total salary: " + totalSalary);
        System.out.println("\n-------------------------------------------------------------------------------------------\n");

        Map<String, List<ApplicationProblems>> groupBYDepartment = list.stream()
                        .collect(Collectors.groupingBy(emp -> emp.getDepartment()));

        groupBYDepartment.forEach((department, empList) -> {
            System.out.println("\nGrouping by department: " + department);
            empList.forEach(emp -> System.out.println(" - " + emp));
        });

        System.out.println("\n-------------------------------------------------------------------------------------------\n");

        ApplicationProblems youngestEmp = list.stream().sorted((a, b) -> a.getAge() - b.getAge()).findFirst().orElse(null);

        System.out.println("Finding the Youngest Employee:\n" + youngestEmp);

        System.out.println("\n-------------------------------------------------------------------------------------------\n");
        System.out.println("Sorting Employees by Age and then by Name:\n");

        list.stream()
                .sorted(Comparator.comparingInt(ApplicationProblems::getAge)
                        .thenComparing(ApplicationProblems::getName))
                .forEach(System.out::println);

        System.out.println("\n-------------------------------------------------------------------------------------------\n");

//        Map<String, String> grpDptName = list.stream().flatMap(emp -> emp.getName()).collect(Collectors.groupingBy(emp-> emp))

    }
}